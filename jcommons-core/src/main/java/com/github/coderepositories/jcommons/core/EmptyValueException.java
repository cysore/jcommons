package com.github.coderepositories.jcommons.core;

/**
 * 空值异常
 * 
 * @author zhangguangyong
 * 
 *         2016年1月21日 下午11:19:46
 */
public class EmptyValueException extends RuntimeException {

	private static final long serialVersionUID = 1999132565954811494L;

	public EmptyValueException() {
		super();
	}

	public EmptyValueException(String s) {
		super(s);
	}
}
