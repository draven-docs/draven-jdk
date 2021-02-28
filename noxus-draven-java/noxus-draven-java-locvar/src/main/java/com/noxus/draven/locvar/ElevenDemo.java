package com.noxus.draven.locvar;

/**
 * 〈功能概述〉<br>
 *
 * @className: ElevenTest
 * @package: noxus.draven.eleven
 * @author: draven
 * @date: 2020/7/4 13:14
 */
public class ElevenDemo {
    /**
     * 1、本地变量类型推断
     * 什么是局部变量类型推断？
     * var javastack = "javastack";
     * System.out.println(javastack);
     * <p>
     * 2.字符串加强
     * a.判断字符串是否为空白
     * " ".isBlank();
     * b.去除首尾空格
     * " Javastack ".strip();
     * c.去除尾部空格
     * " Javastack ".stripTrailing();
     * d.去除首部空格
     * " Javastack ".stripLeading();
     * e.复制字符串
     * "Java".repeat(3);
     * 6.行数统计
     * "A\nB\nC".lines().count();
     * <p>
     * 3.集合加强 @since JDk9
     * var list = List.of("Java", "Python", "C");
     * var copy = List.copyOf(list);
     * System.out.println(list == copy); // true
     *
     * 4.Stream 加强
     *
     */
    public static void main(String[] args) {
        var javastack = "javastack";

        System.out.println(javastack);

        // 判断字符串是否为空白
        " ".isBlank();
        // true
        // 去除首尾空格
        " Javastack ".strip();
        // "Javastack"
        // 去除尾部空格
        " Javastack ".stripTrailing();
        // " Javastack"
        // 去除首部空格
        " Javastack ".stripLeading();
        // "Javastack "
        // 复制字符串
        //"JavaJavaJava"
        "Java".repeat(3);
        // 行数统计  // 3
        "A\nB\nC".lines().count();

    }
}
