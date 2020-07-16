package com.dahua.test;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * Created by 41082 on 2018/6/30.
 */
public class Encode {

    /**
     * encodeToURL方法实现url编码功能，返回编码后的字符串
     * @param s
     * @return
     */
    public String encodeToURL(String s){
        try {
            String temp = URLEncoder.encode(s, "utf-8");
            return temp;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * encryptDES方法实现DES加密，并将结果转化成十六进制的String，
     * 输入参数分别为需要加密的数据、密钥和向量
     * @param encryptString
     * @param encryptKey
     * @param iv
     * @return
     */
    public String encryptDES(String encryptString,String encryptKey, String iv){

        try {
            byte [] key = encryptKey.getBytes();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
            DESKeySpec desKeySpec = new DESKeySpec(key);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            Cipher cipher = Cipher.getInstance("PKCS7Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
            byte[] tempByte = cipher.doFinal(encryptString.getBytes());
            return toHexString(tempByte);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 数组转换为十六进制字符串
     * @param bytes
     * @return
     */
    public String toHexString(byte[] bytes){
        StringBuffer sb = new StringBuffer(bytes.length);
        String temp;
        for (int i = 0; i < bytes.length; i++) {
            temp = Integer.toHexString(0xFF & bytes[i]);
            if (temp.length() < 2){
                sb.append(0);
            }
            sb.append(temp.toUpperCase());
        }
        return sb.toString();
    }

    /**
     * convertToHexString方法实现ASCII码(int)转成十六进制的字符串
     * @param i
     * @return
     */
    public String convertToHexString(int i ){
        return ((Integer)i).toHexString(i);
    }

    /**
     * convertHexStringToData实现十六进制格式的字符串转化成int
     * @param s
     * @return
     */
    public int convertHexStringToData(String s ){
        return Integer.parseInt(s, 16);
    }


    /**
     * String decryptDES 实现DES解密，并将结果转化成String，输入参数分别为需要解密的数据、密钥和向量
     * @param decryptString
     * @param encryptKey
     * @param iv
     * @return
     */
    public String decryptDES(String decryptString, String encryptKey, String iv){
        try {
            byte [] key = encryptKey.getBytes();
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv.getBytes());
            DESKeySpec desKeySpec = new DESKeySpec(key);
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
            byte[] tempByte = cipher.doFinal(decryptString.getBytes());
            return toHexString(tempByte);
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        Encode encode = new Encode();
        System.out.println(encode.encodeToURL("A"));
        System.out.println(encode.encryptDES("%41", "12345678","12345678"));
    }
}
