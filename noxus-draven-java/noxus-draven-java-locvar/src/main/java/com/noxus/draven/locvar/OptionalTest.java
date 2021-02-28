package com.noxus.draven.locvar;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class OptionalTest {

	@Test
	public void testName() throws Exception {
		// of�������������Ĳ�����null, ���׳���ָ���쳣
		//Optional<String> optional = Optional.of(null);
		// ofNullable���Լ��ݿ�ָ��, ����ʵ�ʴ���null��ҪС��
		Optional<Object> optional = Optional.ofNullable(null);
		Object object = optional.orElse("abc"); // ����ڲ�����Ϊ��, �򷵻ز����е�����, ���򷵻��ڲ�����
		System.out.println(object);

		Object object2 = optional.orElseThrow();
		System.out.println(object2);
	}
}
