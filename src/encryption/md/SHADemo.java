package encryption.md;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.digests.SHA224Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;

/**
 * 消息摘要算法——SHA （security hash Algorithm） 安全散列算法 固定长度的摘要信息
 * @author WZM
 *
 * 2018年8月22日
 */
public class SHADemo {
	
	public static void main(String[] args) {
		jdkSHA1();
		jdkSHA256();
	}
	
	private static String src = "message digest demo";

	public static void jdkSHA1(){
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("sha");// sha1算法传入参数为sha
			byte[] sha1Bytes = md.digest(src.getBytes());
			System.out.println("JDK SHA-1:" + Hex.encodeHexString(sha1Bytes));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public static void jdkSHA256(){
		try {
			MessageDigest md = MessageDigest.getInstance("sha-256");
			 md.update(src.getBytes());
			 System.out.println("JDK SHA-256:" + org.bouncycastle.util.encoders.Hex.toHexString(md.digest()));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 /** Bouncy Castle实现sha-1 */
    public static void bouncyCastleSHA1(){

        Digest digest = new SHA1Digest();
        digest.update(src.getBytes(), 0, src.getBytes().length);
        byte[]sha1Bytes = new byte[digest.getDigestSize()];
        digest.doFinal(sha1Bytes, 0);
        System.out.println("bc SHA-1:\t" + org.bouncycastle.util.encoders.Hex.toHexString(sha1Bytes));
    }

    /** Bouncy Castle实现sha-224 */
    public static void bouncyCastleSHA224(){

        Digest digest = new SHA224Digest();
        digest.update(src.getBytes(), 0, src.getBytes().length);
        byte[]sha224Bytes = new byte[digest.getDigestSize()];
        digest.doFinal(sha224Bytes, 0);
        System.out.println("bc SHA-224:\t" + org.bouncycastle.util.encoders.Hex.toHexString(sha224Bytes));
    }

    /** Bouncy Castle实现sha-256 */
    public static void bouncyCastleSHA256() {
        Digest digest = new SHA256Digest();
        digest.update(src.getBytes(), 0, src.getBytes().length);
        byte[] sha256Bytes = new byte[digest.getDigestSize()];
        digest.doFinal(sha256Bytes, 0);
        System.out.println("bc SHA-256:\t" + org.bouncycastle.util.encoders.Hex.toHexString(sha256Bytes));
    }

    /** Commons Codec实现sha-1 */
    public static void commonsCodecSAH1(){

        System.out.println("cc SHA-1:\t" + DigestUtils.sha1Hex(src.getBytes()));

        /* 采用下面的方式更加方便 */
//        System.out.println("cc SHA-1:\t" + DigestUtils.sha1Hex(src));

    }
}
