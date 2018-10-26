package encryption.md;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class MACDemo {

	private static String src = "object-oriente"; // 需要加密的原始字符串

	public static void jdkHmacMD5() throws NoSuchAlgorithmException,
			InvalidKeyException, DecoderException {

		// 1.得到密钥
		KeyGenerator keyGenerator = KeyGenerator.getInstance("hmacMD5");
		SecretKey secretKey = keyGenerator.generateKey();// 生成密钥
		// byte[] key = secretKey.getEncoded();//获得密钥
		byte[] key = Hex.decodeHex("aabbccddee".toCharArray());

		// 2.还原密钥
		SecretKey restoreSecretKey = new SecretKeySpec(key, "hmacMD5");

		// 3.信息摘要
		Mac mac = Mac.getInstance(restoreSecretKey.getAlgorithm());// 实例化mac
		mac.init(restoreSecretKey);// 初始化mac
		byte[] hmacMD5Bytes = mac.doFinal(src.getBytes());// 执行摘要

		System.out.println("jdkHmacMD5:\t" + Hex.encodeHexString(hmacMD5Bytes));
	}

}
