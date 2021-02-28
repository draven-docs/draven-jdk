package com.noxus.draven.eleven;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


public class APITest {

    // �����е�һЩ��ǿ��API
    @Test
    public void test3() {
        LocalDate localDate = LocalDate.of(2019, 1, 21);
        // ������ظ�Ԫ��ʱ, �����޷����, �����׳��쳣
        //Set<Integer> set = Set.of(100, 50, 20, 30, 10, 8, 100, 8);
        Set<Integer> set = Set.of(100, 50, 20, 30, 10, 8);
        System.out.println(set.getClass());

        Stream<Integer> stream = Stream.of(50, 20, 30, 70);
    }

    @Test
    public void test2() {
        int[] arr = {1, 9, 3, 2, 8};
        // ���ٰ����ݱ�ɼ��ϵķ���
        List<String> list1 = Arrays.asList("aa", "yyy", "zzz", "123");
        //list1.add("ppp"); // ��һ�����������Ԫ�صļ���

        // ���ϵĴ�������ʹ�ø��򵥵ķ�ʽ
        List<String> list2 = List.of("aa", "bbb", "cc", "DD");
        System.out.println(list2);

        //list2.add("yyy"); // ���������Ԫ��
        System.out.println(list2);
    }

    @Test
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bbb");
        list.add("cc");
        list.add("DD");

        System.out.println(list);
    }
}
