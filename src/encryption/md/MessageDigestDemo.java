package encryption.md;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * 消息摘要算法 主要目的验证信息完整性，防篡改
 * 
 * 
 * 消息摘要 md 
 * @author WZM
 *
 * 2018年8月22日
 */
public class MessageDigestDemo {
	
	public static void main(String[] args) {
		jdkMd5();
		jdkMd2();
		bouncyCastleMD4();
		commonsCodecMD5();
	}
	
	
	private static String str = "message digest demo";
	
	//----------MD算法家族有3类MD2、MD4、MD5，MD家族生成的都是128比特位的信息摘要--------------------

	/***
	 *  jdk md5 消息摘要
	 */
	public static void jdkMd5(){
		try {
			MessageDigest instance = MessageDigest.getInstance("MD5");
			byte[] digest = instance.digest(str.getBytes());
			System.out.println("jdk md5:" + Hex.encodeHexString(digest));//利用第三方包将byte数组转化为16进制字符串
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/***
	 *  jdk md2 消息摘要
	 */
	public static void jdkMd2(){
		try {
			MessageDigest instance = MessageDigest.getInstance("MD2");
			byte[] digest = instance.digest(str.getBytes());
			System.out.println("jdk md2:" + Hex.encodeHexString(digest));//利用第三方包将byte数组转化为16进制字符串
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Bouncy Castle实现MD4加密
	 */
	public static void bouncyCastleMD4(){
		try {
			Security.addProvider(new BouncyCastleProvider());//通过这种方式给JDK动态添加一个provider,就可以通过这种方式获得JDK本身不支持的MD4了
			MessageDigest instance = MessageDigest.getInstance("md4");
			byte[] digest = instance.digest(str.getBytes());
			System.out.println("bouncyCastleMD4:" + org.bouncycastle.util.encoders.Hex.toHexString(digest));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	/** Commons Codec 实现MD5加密*/
    public static void commonsCodecMD5() {
        System.out.println("cc MD5:" + DigestUtils.md5Hex(str.getBytes()));
    }

	
}
