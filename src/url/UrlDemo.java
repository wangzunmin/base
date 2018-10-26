package url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlDemo {

	public static void main(String[] args) throws IOException {
		try {
			URL url = new URL("www.baidu.com");
			String protocol = url.getProtocol();
			URLConnection connection = url.openConnection();
			InputStream inputStream = connection.getInputStream();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
