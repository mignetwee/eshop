package com.v5ent.rapid4j.core.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
	
	/**
	 * 计算byte[]的MD5
	 * @param byteBuffer
	 * @return
	 */
	public static String getMd5ByByte(byte[] byteBuffer) {
		BigInteger bi = new BigInteger(1, DigestUtils.md5(byteBuffer));
		return bi.toString(16); 
	}
	
	/**
	 * 计算文件的MD5
	 * @param byteBuffer
	 * @return
	 */
	public static String getMd5ByFile(File file) {
		String value = null;
		FileInputStream in = null;
		try {
			in = new FileInputStream(file);
			MappedByteBuffer byteBuffer = in.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(byteBuffer);
			BigInteger bi = new BigInteger(1, md5.digest());
			value = bi.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return value;
	}
}
