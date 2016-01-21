package com.github.coderepositories.jcommons.core;

import java.lang.reflect.Array;
import java.util.Map;

/**
 * <p>
 * 最常用的工具API汇总，比如：判断非空、前置条件验证<br>
 * 为了调用方方便所以就用特殊符号命名了
 * </p>
 * 
 * @author zhangguangyong
 * 
 *         2016年1月21日 下午10:14:35
 */
public abstract class _ {

	/**
	 * 断言一个对象的值为Null
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isNull(Object obj) {
		return null == obj;
	}

	/**
	 * 断言一个对象的值不为Null
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean notNull(Object obj) {
		return null != obj;
	}

	/**
	 * 断言一个对象的值不为空
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean isEmpty(Object obj) {
		return !notEmpty(obj);
	}

	/**
	 * 断言一个对象的值为非空
	 * <p>
	 * obj 为Null -> false <br>
	 * obj 为{@code CharSequence}(字符序列)，{@code obj.toString().trim().length()==0}
	 * , 返回 false <br>
	 * obj 为{@code Array}(数组), {@code obj.length == 0}, 返回 false <br>
	 * obj 为{@code Iterable}(可迭代), {@code obj.iterator().hasNext()==false}, 返回
	 * false <br>
	 * obj 为{@code Map}(键值对), {@code obj.isEmpty()==true}, 返回 false
	 * </p>
	 * 
	 * @param obj
	 * @return
	 */
	public static boolean notEmpty(Object obj) {
		if (isNull(obj)) {
			return false;
		}
		// 传入对象的类型
		Class<? extends Object> cls = obj.getClass();

		// 字符序列
		if (CharSequence.class.isAssignableFrom(cls)) {
			return ((CharSequence) obj).toString().trim().length() > 0;
		}

		// 数组
		if (cls.isArray()) {
			return Array.getLength(obj) > 0;
		}

		// 可迭代的
		if (Iterable.class.isAssignableFrom(cls)) {
			return ((Iterable<?>) obj).iterator().hasNext();
		}

		// 键值对
		if (Map.class.isAssignableFrom(cls)) {
			return !((Map<?, ?>) obj).isEmpty();
		}

		// 其他类型
		return true;
	}

	/**
	 * 检查Null值，如果 reference 为Null，则抛出{@code NullPointerException}异常
	 * 
	 * @param reference
	 * @return
	 */
	public static <T> T checkNotNull(T reference) {
		if (reference == null) {
			throw new NullPointerException();
		}
		return reference;
	}

	/**
	 * 检查Null值，如果 reference 为Null，则抛出{@code NullPointerException}异常
	 * 
	 * @param reference
	 * @param errorMessage
	 *            错误消息描述
	 * @return
	 */
	public static <T> T checkNotNull(T reference, Object errorMessage) {
		if (reference == null) {
			throw new NullPointerException(String.valueOf(errorMessage));
		}
		return reference;
	}

	/**
	 * 检查Null值，如果 reference 为Null，则抛出{@code NullPointerException}异常
	 * 
	 * @param reference
	 * @param errorMessageTemplate
	 *            错误消息模板
	 * @param errorMessageArgs
	 *            错误消息参数
	 * @return
	 */
	public static <T> T checkNotNull(T reference, String errorMessageTemplate, Object... errorMessageArgs) {
		if (reference == null) {
			throw new NullPointerException(String.format(errorMessageTemplate, errorMessageArgs));
		}
		return reference;
	}

	/**
	 * 检查空值，如果 reference 为空，则抛出{@code EmptyValueException}异常
	 * 
	 * @param reference
	 * @return
	 */
	public static <T> T checkNotEmpty(T reference) {
		if (isEmpty(reference)) {
			throw new EmptyValueException();
		}
		return reference;
	}

	/**
	 * 检查空值，如果 reference 为空，则抛出{@code EmptyValueException}异常
	 * 
	 * @param reference
	 * @param errorMessage
	 *            自定义错误消息描述
	 * @return
	 */
	public static <T> T checkNotEmpty(T reference, Object errorMessage) {
		if (reference == null) {
			throw new EmptyValueException(String.valueOf(errorMessage));
		}
		return reference;
	}

	/**
	 * 检查空值，如果 reference 为空，则抛出{@code EmptyValueException}异常
	 * 
	 * @param reference
	 * @param errorMessageTemplate
	 *            错误消息模板
	 * @param errorMessageArgs
	 *            错误消息参数
	 * @return
	 */
	public static <T> T checkNotEmpty(T reference, String errorMessageTemplate, Object... errorMessageArgs) {
		if (reference == null) {
			throw new EmptyValueException(String.format(errorMessageTemplate, errorMessageArgs));
		}
		return reference;
	}

	public static void main(String[] args) {
		try {
			checkNotEmpty(null);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
