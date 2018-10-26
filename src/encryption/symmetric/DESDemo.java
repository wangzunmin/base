package encryption.symmetric;
import java.security.Key;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.codec.binary.Hex;
/**
 * 对称加密算法
 * 
 * 对称加密算法中，数据发信方将明文（原始数据）和加密密钥（mi yue）一起经过特殊加密算法处理后，使其变成复杂的加密密文发送出去。
 * 收信方收到密文后，若想解读原文，则需要使用加密用过的密钥及相同算法的逆算法对密文进行解密，才能使其恢复成可读明文。
 * 在对称加密算法中，使用的密钥只有一个，发收信双方都使用这个密钥对数据进行加密和解密，这就要求解密方事先必须知道加密密钥
 * 
 * DES、3DES（TripleDES）、AES
 * @author WZM
 *
 * 2018年8月23日
 */
public class DESDemo {
	
	private static String src = "imooc security des";
	public static void jdkDES() {
		 
	    //生成密钥
	    try {
	        KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
	        //指定keysize
	        keyGenerator.init(56);
	        SecretKey secretKey = keyGenerator.generateKey();
	        byte[] bytesKey = secretKey.getEncoded();
 
	        //key转换
	        DESKeySpec desKeySpec = new DESKeySpec(bytesKey);
	        SecretKeyFactory factory = SecretKeyFactory.getInstance("DES");
	        Key convertSecretKey = factory.generateSecret(desKeySpec);
 
	        //加密 
	        Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
	        cipher.init(Cipher.ENCRYPT_MODE, convertSecretKey);
	        byte[] resultBytes =  cipher.doFinal(src.getBytes());
	        System.out.println("jdk des encrypt : " + Hex.encodeHexString(resultBytes));
 
	        //解密
	        cipher.init(Cipher.DECRYPT_MODE, convertSecretKey);
	        resultBytes = cipher.doFinal(resultBytes);
	        System.out.println("jdk des decrypt : " + new String(resultBytes));
 
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		jdkDES();
	}
}
