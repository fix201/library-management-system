package com.harrisburgu.lms.services;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CopyUtil {

	@SneakyThrows
	public static <T> void copyProperties(T from, T to)  {
		if (!to.getClass().equals(from.getClass())) {
			throw new IllegalArgumentException(to.getClass() + " is of a different type than " + from.getClass());
		}
		final List<Field> fields = getAllModelFields(from.getClass());
		for (Field field : fields) {
			field.setAccessible(true);
			final Object fieldValue = field.get(from);
			if (fieldValue != null) {
				field.set(to, fieldValue);
			}
		}
	}

	private static List<Field> getAllModelFields(Class<?> clazz) {
		List<Field> fields = new ArrayList<>();
		do {
			Collections.addAll(fields, clazz.getDeclaredFields());
			clazz = clazz.getSuperclass();
		} while (clazz != null);
		return fields;
	}
}
