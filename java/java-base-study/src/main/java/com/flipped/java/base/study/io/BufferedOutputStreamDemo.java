package com.flipped.java.base.study.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节缓冲输出流小案例
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-02-20 22:02:58
 */
public class BufferedOutputStreamDemo {

    public static void main(String[] args) {
        try (var fos = new FileOutputStream("data/abcd.txt");
             var bos = new BufferedOutputStream(fos)) {

            var bytes = "abcdefghijklmnopqrstuvwxyz".getBytes();
            bos.write(bytes);
            bos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
