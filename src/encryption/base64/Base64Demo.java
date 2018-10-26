package encryption.base64;

import java.io.IOException;
import java.util.logging.Logger;

import org.bouncycastle.util.encoders.Base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
/**
 * 不可见字符串的信息用可见字符串表示出来
 * @author WZM
 *
 * 2018年8月21日
 */
public class Base64Demo {

	public static void main(String[] args) {
		codecBase64();
	}
	
	private static String str = "base64 security demo";

	/**
	 * jdk自带的base64
	 */
	public static void jdkBase64(){
		try {
			BASE64Encoder base64Encoder = new BASE64Encoder();
			String encode = base64Encoder.encode(str.getBytes());
			System.out.println(encode);
			
			BASE64Decoder base64Decoder = new BASE64Decoder();
			String string = new String(base64Decoder.decodeBuffer(encode));
			System.out.println(string);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * bouncy Castle base64
	 */
	public static void bouncyCastleBase64(){
		byte[] encode = Base64.encode(str.getBytes());
		System.out.println(new String(encode));
		
		byte[] decode = Base64.decode(encode);
		System.out.println(new String(decode));
	}
	
	/**
	 * apache Commons codec base64
	 */
	public static void codecBase64(){
		byte[] encodeBase64 = org.apache.commons.codec.binary.Base64.encodeBase64(str.getBytes());
		System.out.println(new String(encodeBase64));
		
		byte[] decodeBase64 = org.apache.commons.codec.binary.Base64.decodeBase64(encodeBase64);
		System.out.println(new String(decodeBase64));
		
//		Logger logger = Logger.getLogger("log");//JDK自带的log
//		logger.info("xxxxxxx");
	}
}
