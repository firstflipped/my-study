package com.flipped.java.base.study.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节缓冲输入流小案例
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-02-20 21:51:12
 */
public class BufferedInputStreamDemo {

    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data/flipped.txt");
             BufferedInputStream bis = new BufferedInputStream(fis)) {
            byte[] bytes = bis.readAllBytes();
            String str = new String(bytes);
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
