

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.KeyStore;

import javax.net.ssl.SSLContext;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;

/**
 * 使用 httpclient4.5 进行 https 通讯， 采用双向认证， 连接池管理connection
 * 
 * 
 * 一个证书是一个实体的数字签名,还包含这个实体的公共钥匙值. 
 * Keytool 把钥匙和证书储存到一个keystore
 * 
 * 
 * 信息加密 认证 证书
 * 
 * @author limin.zhang
 *
 */
public class HttpClientforSSL {

	public static HttpClientConnectionManager CONNECTION_MANAGER = null;

	/**
	 * 初始化 connection manager.
	 * 
	 * @param keyStoreFile
	 * @param keyStorePass
	 * @param trustStoreFile
	 * @param trustStorePass
	 * @throws Exception
	 */
	public void init(String keyStoreFile, String keyStorePass,
			String trustStoreFile, String trustStorePass) throws Exception {
		System.out.println("init conection pool...");

		File file = new File(keyStoreFile);
		file.createNewFile();
		File file2 = new File(trustStoreFile);
		file2.createNewFile();
		InputStream ksis = new FileInputStream(file);
		InputStream tsis = new FileInputStream(file2);

		KeyStore ks = KeyStore.getInstance("PKCS12");
		ks.load(ksis, keyStorePass.toCharArray());

		KeyStore ts = KeyStore.getInstance("JKS");
		ts.load(tsis, trustStorePass.toCharArray());

        // init SSLContext with keystore, truststore
		SSLContext sslContext = SSLContexts.custom()
				.loadKeyMaterial(ks, keyStorePass.toCharArray())
				.loadTrustMaterial(ts, new TrustSelfSignedStrategy()).build();

		// init SSLConnectionSocketFactory
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext,
                new String[] { "TLSv1" },
                null,
                NoopHostnameVerifier.INSTANCE); // not check common name

		Registry<ConnectionSocketFactory> registry = RegistryBuilder
				.<ConnectionSocketFactory> create()
				.register("http", PlainConnectionSocketFactory.INSTANCE)
				.register("https", sslsf).build();
		ksis.close();
		tsis.close();
		CONNECTION_MANAGER = new PoolingHttpClientConnectionManager(registry);
	}

	/**
	 * do post
	 * 
	 * @param url
	 * @param params
	 * @throws Exception
	 */
	public String doPost(String url, String params) throws Exception {
		if (CONNECTION_MANAGER == null) {
			return null;
		}
		CloseableHttpClient httpClient = HttpClients.custom()
				.setConnectionManager(CONNECTION_MANAGER).build();
		HttpPost httpPost = new HttpPost(url);

		httpPost.setEntity(new StringEntity(params,
				ContentType.APPLICATION_JSON));

		CloseableHttpResponse resp = httpClient.execute(httpPost);
		System.out.println(resp.getStatusLine());
		InputStream respIs = resp.getEntity().getContent();
		String content = convertStreamToString(respIs);
		EntityUtils.consume(resp.getEntity());
		return content;
	}

	// Get data from InputStream
	public static String convertStreamToString(InputStream is) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String classPath = HttpClientforSSL.class.getClassLoader().getResource("").getPath();
		// 服务地址
		String serverAddress = "https://xin.chanpay.com";
		String merchantCode = "www.chanpay.com";
        String apiAddress = serverAddress + "/api/rest/UidApiService/authCardWithoutOTP";

        // TODO: 调整成本地路径
        String keyStorePath = classPath;

		// 私钥证书
		String keyStoreFile = keyStorePath + merchantCode + ".p12";
		String keyStorePass = "384275582747419";

		// 配置信任证书库及密码
		String trustStoreFile = keyStorePath + "cacerts";
		String trustStorePass = "changeit";


		// 服务参数，这里接口的参数采用 json 格式传递
        String params = "{\"merchantCode\": \""+merchantCode+"\","
				+ "\"channel\": \"\","
                + "\"sessionId\": \"10000011\","
                + "\"userName\": \"冯X\","
                + "\"idNumber\": \"1504041982040XX\","
                + "\"cardNo\": \"6226890120140XXX\"," + "\"phoneNo\": \"1864817XX\"}";

		HttpClientforSSL obj = new HttpClientforSSL();
		try {
			obj.init(keyStoreFile, keyStorePass, trustStoreFile, trustStorePass);
			for (int i = 0; i < 3; i++) {
//				String content = obj.doPost(apiAddress, params);
//                System.out.println(content);
            }

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
