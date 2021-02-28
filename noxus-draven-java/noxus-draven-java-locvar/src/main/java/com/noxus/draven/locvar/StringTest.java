package com.noxus.draven.locvar;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;

public class StringTest {

    @Test
    public void testName3() throws Exception {
        FileInputStream fis = new FileInputStream("src/com/noxus/draven/eleven/StringTest.java");
        byte[] buffer = new byte[fis.available()];
        fis.read(buffer);
        fis.close();
        String string = new String(buffer);
        string.lines().forEach(System.out::println);
    }

    @Test
    public void testName2() throws Exception {
        String string = "Java";
        String string2 = string.repeat(5);
        System.out.println(string2);
    }

    @Test
    public void testName() throws Exception {
        String string = " \t  \r\n ";
        System.out.println(string.isBlank()); // �ж��ַ����е��ַ��Ƿ��ǿհ�

        System.out.println("**************************");

        string = " \t  \r\n abc \t��";
        String string2 = string.strip(); // ȥ���ַ�����β�Ŀհ�, ����Ӣ�ĺ��������������еĿհ��ַ�
        System.out.println(string2);
        System.out.println(string2.length());

        String string3 = string.trim(); // ȥ���ַ�����β�Ŀհ��ַ�, ֻ��ȥ����ֵС�ڵ���32�Ŀհ��ַ�
        System.out.println(string3);
        System.out.println(string3.length());

        System.out.println("**************************");
        String string4 = string.stripLeading(); // ȥ���ַ����ײ��Ŀհ�
        System.out.println(string4);
        System.out.println(string4.length());

        String string5 = string.stripTrailing(); // ȥ���ַ���β���Ŀհ�
        System.out.println(string5);
        System.out.println(string5.length());
    }
}
