package org.knowm.xchange.stablehouse.util;

import lombok.extern.slf4j.Slf4j;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.HttpMethod;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Slf4j
public class StablehouseAuthenticated {

    final String timestamp = "";
    //add your api Key here
    final String KEY = "";
    //add your api Secret here
    final String secretKey = "";
    //add your api Passphrase here
    final String PASSPHRASE = "";
    //Api url
    final String path = "";

    private static final String ALGORITHM = "HmacSHA256";


    public static String generate(HttpMethod method, final String path, final long timestamp, String data, final String secretKey) {

        String stringToSign = method + path + timestamp;
        if (data != null) {
            stringToSign += data;
        }
        return sign(secretKey, stringToSign);
    }

    private static String sign(String secret, String data) {
        String signature = "";
        try {
            Mac mac = Mac.getInstance(ALGORITHM);
            byte[] key = Base64.getDecoder().decode(secret);
            SecretKeySpec keSpec = new SecretKeySpec(key, ALGORITHM);
            mac.init(keSpec);
            signature = Base64.getEncoder().encodeToString(mac.doFinal(data.getBytes()));
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            log.error("Error signing the message", e);
        }
        return signature;
    }
}

