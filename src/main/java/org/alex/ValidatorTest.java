package org.alex;

import java.util.Map;

import org.alex.model.StudentInfo;
import org.alex.util.ValidatorUtil;

public class ValidatorTest {

	public static void main(String[] args) {
		StudentInfo info = new StudentInfo();
		long startTime = System.currentTimeMillis();
		print(ValidatorUtil.validate(info));
		System.out.println("===============耗时(毫秒)=" + (System.currentTimeMillis() - startTime));

		info.setUserName("小明");
		info.setAge("a10");
		info.setBirthday("2016-9-1");
		startTime = System.currentTimeMillis();
		print(ValidatorUtil.validate(info));
		System.out.println("===============耗时(毫秒)=" + (System.currentTimeMillis() - startTime));
	}

	private static void print(Map<String, StringBuffer> errorMap) {
		if (errorMap != null) {
			for (Map.Entry<String, StringBuffer> m : errorMap.entrySet()) {
				System.out.println(m.getKey() + ":" + m.getValue().toString());
			}
		}
	}

}