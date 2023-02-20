package com.flipped.java.base.study.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流小案例
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-02-20 22:18:06
 */
public class FileReaderDemo {

    public static void main(String[] args) {
        // 使用字符流不会出现字符中文乱码的现象，在实际应用场景中，视频图片操作一般使用字节流，字符操作使用字符流
        try (var fr = new FileReader("data/flipped.txt")) {
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
