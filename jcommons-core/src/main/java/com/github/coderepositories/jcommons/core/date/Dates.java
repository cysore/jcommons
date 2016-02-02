package com.github.coderepositories.jcommons.core.date;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 * 日期时间工具类
 * 
 * @author zhangguangyong
 *
 *         2016年1月30日 下午4:18:53
 */
public abstract class Dates {

	/**
	 * 中月
	 */
	static List<Integer> MID_MONTH = Collections.unmodifiableList(Arrays.asList(4, 6, 8, 11));

	/**
	 * 小月
	 */
	public static int MIN_MONTH = 2;

	/**
	 * 默认日期格式
	 */
	static String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

	/**
	 * 默认的时间格式
	 */
	static String DEFAULT_TIME_PATTERN = "HH:mm:ss";

	/**
	 * 默认日期时间格式
	 */
	static String DEFAULT_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 一分钟的秒数
	 */
	public static final int SECONDS_PER_MINUTE = 60;

	/**
	 * 一小时分钟数
	 */
	public static final int MINUTES_PER_HOUR = 60;

	/**
	 * 一天小时数
	 */
	public static final int HOURS_PER_DAY = 24;

	/**
	 * 一天秒数
	 */
	public static final int SECONDS_PER_DAY = (HOURS_PER_DAY * MINUTES_PER_HOUR * SECONDS_PER_MINUTE);

	/**
	 * 一天毫秒数
	 */
	public static final long DAY_MILLISECONDS = SECONDS_PER_DAY * 1000L;

	/**
	 * 日期转换为字符串格式
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(Date date, String pattern) {
		return new DateTime(date.getTime()).toString(pattern);
	}

	/**
	 * 日期转换为字符串格式，使用默认的日期格式模式
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date) {
		return format(date, DEFAULT_DATE_PATTERN);
	}

	/**
	 * 日期转换为字符串格式，使用默认的时间格式模式
	 * 
	 * @param date
	 * @return
	 */
	public static String formatTime(Date date) {
		return format(date, DEFAULT_TIME_PATTERN);
	}

	/**
	 * 日期转换为字符串格式，使用默认的日期时间格式模式
	 * 
	 * @param date
	 * @return
	 */
	public static String formatDateTime(Date date) {
		return format(date, DEFAULT_DATE_TIME_PATTERN);
	}

	/**
	 * 字符串转换为日期格式
	 * 
	 * @param date
	 * @param pattern
	 *            日期字符串模式
	 * @return
	 */
	public static Date parse(String date, String pattern) {
		return DateTimeFormat.forPattern(pattern).parseDateTime(date).toDate();
	}

	/**
	 * 字符串转换为日期格式，使用默认的日期格式
	 * 
	 * @param date
	 * @return
	 */
	public static Date parseDate(String date) {
		return parse(date, DEFAULT_DATE_PATTERN);
	}

	/**
	 * 字符串转换为日期格式，使用默认的日期时间格式
	 * 
	 * @param date
	 * @return
	 */
	public static Date parseDateTime(String date) {
		return parse(date, DEFAULT_DATE_TIME_PATTERN);
	}

	/**
	 * 获取当天的开始时间
	 * 
	 * @return
	 */
	public static Date getStartOfDay() {
		DateTime d = DateTime.now();
		return new DateTime(d.getYear(), d.getMonthOfYear(), d.getDayOfMonth(), 0, 0, 0, 0).toDate();
	}

	/**
	 * 获取当天的结束时间
	 * 
	 * @return
	 */
	public static Date getEndOfDay() {
		DateTime d = DateTime.now();
		return new DateTime(d.getYear(), d.getMonthOfYear(), d.getDayOfMonth(), 23, 23, 59, 999).toDate();
	}

	/**
	 * 获取当前月的第一天的开始时间
	 * 
	 * @return
	 */
	public static Date getStartOfMonth() {
		DateTime d = DateTime.now();
		return new DateTime(d.getYear(), d.getMonthOfYear(), 1, 0, 0, 0, 0).toDate();
	}

	/**
	 * 获取当前月的最后一天的结束时间
	 * 
	 * @return
	 */
	public static Date getEndOfMonth() {
		DateTime d = DateTime.now();
		int y = d.getYear();
		int m = d.getMonthOfYear();
		return new DateTime(y, m, getDaysOfMonth(y, m), 23, 23, 59, 999).toDate();
	}

	/**
	 * 判断是否是大月
	 * 
	 * @param month
	 * @return
	 */
	public static boolean isMaxMonth(int month) {
		return !(isMidMonth(month) || isMinMonth(month));
	}

	/**
	 * 判断是否是小月
	 * 
	 * @param month
	 * @return
	 */
	public static boolean isMinMonth(int month) {
		return month == MIN_MONTH;
	}

	/**
	 * 判断是否是中月
	 * 
	 * @param month
	 * @return
	 */
	public static boolean isMidMonth(int month) {
		return MID_MONTH.contains(month);
	}

	/**
	 * 获取当前月有多少天
	 * 
	 * @param date
	 * @return
	 */
	public static int getDaysOfMonth(Date date) {
		DateTime dt = new DateTime(date.getTime());
		return getDaysOfMonth(dt.getYear(), dt.getMonthOfYear());
	}

	/**
	 * 获取当指定年份的月份有多少天
	 * 
	 * @param year
	 * @param month
	 * @return
	 */
	public static int getDaysOfMonth(int year, int month) {
		return isMidMonth(month) ? 30 : isMaxMonth(month) ? 31 : isLeapYear(year) ? 28 : 29;
	}

	/**
	 * 判断是否是闰年(1)年份能被4整除，但不能被100整除；(2)能被400整除。
	 * 
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	/**
	 * 自定义日期时间字段
	 * 
	 * @author zhangguangyong
	 *
	 *         2016年1月30日 下午4:27:47
	 */
	private static enum DateTimeField {
		YEAR, MONTH, WEEKS, DAY, HOURS, MINUTES, SECONDS, MILLIS,
	}

	/**
	 * 添加年
	 * 
	 * @param date
	 * @param years
	 * @return
	 */
	public static Date plusYears(Date date, int years) {
		return plus(date, years, DateTimeField.YEAR);
	}

	/**
	 * 添加月
	 * 
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date plusMonths(Date date, int months) {
		return plus(date, months, DateTimeField.MONTH);
	}

	/**
	 * 添加星期
	 * 
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date plusWeeks(Date date, int weeks) {
		return plus(date, weeks, DateTimeField.WEEKS);
	}

	/**
	 * 添加天
	 * 
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date plusDays(Date date, int days) {
		return plus(date, days, DateTimeField.DAY);
	}

	/**
	 * 添加小时
	 * 
	 * @param date
	 * @param hours
	 * @return
	 */
	public static Date plusHours(Date date, int hours) {
		return plus(date, hours, DateTimeField.HOURS);
	}

	/**
	 * 添加分
	 * 
	 * @param date
	 * @param minutes
	 * @return
	 */
	public static Date plusMinutes(Date date, int minutes) {
		return plus(date, minutes, DateTimeField.MINUTES);
	}

	/**
	 * 添加秒
	 * 
	 * @param date
	 * @param seconds
	 * @return
	 */
	public static Date plusSeconds(Date date, int seconds) {
		return plus(date, seconds, DateTimeField.SECONDS);
	}

	/**
	 * 添加毫秒
	 * 
	 * @param date
	 * @param millis
	 * @return
	 */
	public static Date plusMillis(Date date, int millis) {
		return plus(date, millis, DateTimeField.MILLIS);
	}

	/**
	 * 日期计算
	 * 
	 * @param date
	 * @param plus
	 * @param field
	 * @return
	 */
	private static Date plus(Date date, int plus, DateTimeField field) {
		DateTime dt = new DateTime(date);
		switch (field) {
		case YEAR:
			dt = dt.plusYears(plus);
			break;
		case MONTH:
			dt = dt.plusMonths(plus);
			break;
		case WEEKS:
			dt = dt.plusWeeks(plus);
			break;
		case DAY:
			dt = dt.plusDays(plus);
			break;
		case HOURS:
			dt = dt.plusHours(plus);
			break;
		case MINUTES:
			dt = dt.plusMinutes(plus);
			break;
		case SECONDS:
			dt = dt.plusSeconds(plus);
			break;
		case MILLIS:
			dt = dt.plusMillis(plus);
			break;
		}
		return dt.toDate();
	}

	/**
	 * 获取星期数相对于年份
	 * 
	 * @param date
	 * @return
	 */
	public static int getWeekOfYear(Date date) {
		return new DateTime(date.getTime()).getWeekOfWeekyear();
	}

	/**
	 * 获取天数相对于星期
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayOfWeek(Date date) {
		return new DateTime(date.getTime()).getDayOfWeek();
	}

	/**
	 * 获取天数相对于月份
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayOfMonth(Date date) {
		return new DateTime(date.getTime()).getDayOfMonth();
	}

	/**
	 * 获取天数相对于年份
	 * 
	 * @param date
	 * @return
	 */
	public static int getDayOfYear(Date date) {
		return new DateTime(date.getTime()).getDayOfYear();
	}

	/**
	 * 获取月份相对于年份
	 * 
	 * @param date
	 * @return
	 */
	public static int getMonthOfYear(Date date) {
		return new DateTime(date.getTime()).getMonthOfYear();
	}

	/**
	 * 获取小时相对于天
	 * 
	 * @param date
	 * @return
	 */
	public static int getHourOfDay(Date date) {
		return new DateTime(date.getTime()).getHourOfDay();
	}

	/**
	 * 获取分钟相对于小时
	 * 
	 * @param date
	 * @return
	 */
	public static int getMinuteOfHour(Date date) {
		return new DateTime(date.getTime()).getMinuteOfHour();
	}

	/**
	 * 获取分钟相对于天
	 * 
	 * @param date
	 * @return
	 */
	public static int getMinuteOfDay(Date date) {
		return new DateTime(date.getTime()).getMinuteOfDay();
	}

	/**
	 * 获取当前秒钟相对于分钟
	 * 
	 * @param date
	 * @return
	 */
	public static int getSecondOfMinute(Date date) {
		return new DateTime(date.getTime()).getSecondOfMinute();
	}

	/**
	 * 获取当前秒钟相对于天
	 * 
	 * @param date
	 * @return
	 */
	public static int getSecondOfDay(Date date) {
		return new DateTime(date.getTime()).getSecondOfDay();
	}

	/**
	 * 获取当前毫秒相对于秒
	 * 
	 * @param date
	 * @return
	 */
	public static int getMillisOfSecond(Date date) {
		return new DateTime(date.getTime()).getMillisOfSecond();
	}

	/**
	 * 获取当前毫秒相对于天
	 * 
	 * @param date
	 * @return
	 */
	public static int getMillisOfDay(Date date) {
		return new DateTime(date.getTime()).getMillisOfDay();
	}

	/**
	 * 获取当前日期-时间的字符串格式
	 * 
	 * @return
	 */
	public static String getCurrentDateTime() {
		return formatDateTime(new Date());
	}

	/**
	 * 获取当前日期的字符串格式
	 * 
	 * @return
	 */
	public static String getCurrentDate() {
		return formatDate(new Date());
	}

	/**
	 * 获取当前时间的字符串格式
	 * 
	 * @return
	 */
	public static String getCurrentTime() {
		return formatTime(new Date());
	}

	/**
	 * Double 转 Date,主要用于Excel解析
	 * 
	 * @param date
	 * @return
	 */
	public static Date getJavaDate(double date) {
		return getJavaDate(date, (TimeZone) null);
	}

	/**
	 * Double 转 Date,主要用于Excel解析
	 * 
	 * @param date
	 * @param tz
	 * @return
	 */
	public static Date getJavaDate(double date, TimeZone tz) {
		return getJavaDate(date, false, tz);
	}

	/**
	 * Double 转 Date,主要用于Excel解析
	 * 
	 * @param date
	 * @param use1904windowing
	 * @param tz
	 * @return
	 */
	public static Date getJavaDate(double date, boolean use1904windowing, TimeZone tz) {
		return getJavaCalendar(date, use1904windowing, tz, false).getTime();
	}

	/**
	 * Double 转 Date,主要用于Excel解析
	 * 
	 * @param date
	 * @param use1904windowing
	 * @param timeZone
	 * @param roundSeconds
	 * @return
	 */
	public static Calendar getJavaCalendar(double date, boolean use1904windowing, TimeZone timeZone,
			boolean roundSeconds) {
		int wholeDays = (int) Math.floor(date);
		int millisecondsInDay = (int) ((date - wholeDays) * DAY_MILLISECONDS + 0.5);
		Calendar calendar;
		if (timeZone != null) {
			calendar = new GregorianCalendar(timeZone);
		} else {
			calendar = new GregorianCalendar(); // using default time-zone
		}
		setCalendar(calendar, wholeDays, millisecondsInDay, use1904windowing, roundSeconds);
		return calendar;
	}

	/**
	 * Double 转 Date,主要用于Excel解析
	 * 
	 * @param calendar
	 * @param wholeDays
	 * @param millisecondsInDay
	 * @param use1904windowing
	 * @param roundSeconds
	 */
	public static void setCalendar(Calendar calendar, int wholeDays, int millisecondsInDay, boolean use1904windowing,
			boolean roundSeconds) {
		int startYear = 1900;
		int dayAdjust = -1; // Excel thinks 2/29/1900 is a valid date, which it
							// isn't
		if (use1904windowing) {
			startYear = 1904;
			dayAdjust = 1; // 1904 date windowing uses 1/2/1904 as the first day
		} else if (wholeDays < 61) {
			// Date is prior to 3/1/1900, so adjust because Excel thinks
			// 2/29/1900 exists
			// If Excel date == 2/29/1900, will become 3/1/1900 in Java
			// representation
			dayAdjust = 0;
		}
		calendar.set(startYear, 0, wholeDays + dayAdjust, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, millisecondsInDay);
		if (roundSeconds) {
			calendar.add(Calendar.MILLISECOND, 500);
			calendar.clear(Calendar.MILLISECOND);
		}
	}

}
