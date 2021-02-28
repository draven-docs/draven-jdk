package com.noxus.draven.eleven;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

/**
 * ���Ĵ���
 * 1) ������
 * 2) �м����
 * 3) ��ֹ����
 */

public class StreamTest {

	@Test
	public void test3() {
		// ���ĵ���, ������
		Stream<Integer> stream1 = Stream.iterate(1, t -> (2 * t) + 1);
		stream1.limit(10).forEach(System.out::println);

		System.out.println("*************************");
		// ���޵ĵ���
		Stream<Integer> stream2 = Stream.iterate(1, t -> t < 1000, t -> (2 * t) + 1);
		stream2.forEach(System.out::println);
	}

	@Test
	public void test2() {
		Stream<Integer> stream1 = Stream.of(3, 9, 20, 22, 40, 7);
		// �·���, takeWhile, dropWhile
		// ������һֱ��ȡ�ж���Ϊ���Ԫ��, һ������Ԫ��Ϊ��, ����ֹ����.
		Stream<Integer> stream2 = stream1.takeWhile(t -> t % 2 != 0);
		stream2.forEach(System.out::println);

		System.out.println("**********************");
		stream1 = Stream.of(3, 9, 20, 22, 40, 7);
		Stream<Integer> stream3 = stream1.dropWhile(t -> t % 2 != 0);
		stream3.forEach(System.out::println);

	}

	@Test
	public void test1() {
		Stream<Integer> stream1 = Stream.of(3, 9, 20, 22, 40);
		//stream1.forEach(t -> System.out.println(t));
		stream1.forEach(System.out::println);

		System.out.println("***********************************");

		Stream<Object> stream2 = Stream.of(); // ����û������
		stream2.forEach(System.out::println);

		System.out.println("***********************************");

		// ����null�ᱻ����Ϊ��һ���������, ���һ���������ĳ�����Ϣ
		//Stream<Object> stream3 = Stream.of(null);
		//stream3.forEach(System.out::println);

		// ���Դ��� һ��null������������
		Stream<Object> stream3 = Stream.ofNullable(null);
		stream3.forEach(System.out::println);
	}
}
