package com.fit.eledger.cloud.ws.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtil {

	public enum Algorithm {
		MD5("MD5"), SHA("SHA-1"), SHA256("SHA-256"), SHA512("SHA-512");

		private String value;

		private Algorithm(String value) {
			this.value = value;
		}

		public String toString() {
			return value;
		}
	}

	public static String encrypt(byte[] value, Algorithm algorithm) throws NoSuchAlgorithmException {
		final MessageDigest digest = MessageDigest.getInstance(algorithm.toString());
		digest.update(value, 0, value.length);
		final BigInteger i = new BigInteger(1, digest.digest());
		return String.format("%1$032X", i);
	}
}
