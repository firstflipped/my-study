package com.flipped.java.base.study.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件字节输入流小案例
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-02-20 21:36:24
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        // try source写法，自动关闭流
        try(var fis = new FileInputStream("data/flipped.txt")) {
            // 返回输入流中可以读取的字节数。
            var available = fis.available();
            System.out.println("Number of remaining bytes: " + available);

            // 忽略输入流中的 n 个字节 ,返回实际忽略的字节数。
            var skip = fis.skip(2);
            System.out.println("The actual number of bytes skipped: " + skip);

            // 打印字节内容
            System.out.print("The content read from file: ");
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
