package com.noxus.draven.locvar;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;

public class InputStreamTest {

	@Test
	public void testName() throws Exception {
		var cl = this.getClass().getClassLoader();
		try (var is = cl.getResourceAsStream("file"); var os = new FileOutputStream("file2")) {
			is.transferTo(os); // ���������е���������ֱ���Զ��ظ��Ƶ��������
		}
	}
}
