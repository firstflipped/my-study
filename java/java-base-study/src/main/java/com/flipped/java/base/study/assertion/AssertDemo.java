package com.flipped.java.base.study.assertion;

import java.util.Arrays;
import java.util.List;

/**
 * 断言小例子
 *
 * @author <a href="#">flipped</a>
 * @version v1.0
 * @since 2023-02-07 22:39:46
 */
public class AssertDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4);
        assert list.size() == 2;
        System.out.println("集合长度" + list.size());
    }

}
