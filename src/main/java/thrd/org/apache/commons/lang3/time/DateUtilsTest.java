package thrd.org.apache.commons.lang3.time;


import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsTest {


    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        Date date2 = new Date();
        /**
         * return  boolean
         * 日期是否相等
         */
        say(DateUtils.isSameDay(date1, date2));
        /**
         * 毫秒数是否相等
         * return  boolean
         */
        say(DateUtils.isSameInstant(date1, date2));
        /**
         * 根据第二个参数patter 与第一个参数：字符串时间去匹配，转换为Date类行---Thu Jan 29 00:00:00 CST 2015
         */
        sayDate(DateUtils.parseDateStrictly("2015/1/29", "yyyy/MM/dd"));
        /**
         * 根据第二个参数patter 与第一个参数：字符串时间去匹配，转换为Date类行---Thu Jan 29 00:00:00 CST 2015
         * 上面那个更严格
         */
        sayDate(DateUtils.parseDate("2015/1/29", "yyyy/MM/dd"));
        /**
         * 当前时间+天数2015-02-02 10:23:06
         */
        sayDate(DateUtils.addDays(date1, 4));
        /**
         * 2016-01-29 10:24:01
         * 前时间+年数
         */
        sayDate(DateUtils.addYears(date1, 1));
        /**
         * 2015-03-29 10:24:57
         */
        sayDate(DateUtils.addMonths(date1, 2));
        /**
         * 前时间+周数
         */
        sayDate(DateUtils.addWeeks(date1, 1));
        /**
         * 2015-01-30 10:30:38
         * +天
         */
        sayDate(DateUtils.addDays(date1, 1));
        /**
         * 2015-01-29 11:31:23
         * +小时
         */
        sayDate(DateUtils.addHours(date1, 1));
        /**
         * 2015-01-29 10:31:56
         * 2015-01-29 10:51:56
         */
        sayDate(DateUtils.addMinutes(date1, 20));
        //addSeconds  加秒数-。-不测了 addMilliseconds
        /**
         * 不知道干嘛
         */
        sayDate(DateUtils.setYears(DateUtils.addHours(date1, 1), 2015));
        /**
         * Calendar
         */
        say(DateUtils.toCalendar(date1));
        /**
         * filed =Calender.YEAR,Calendar.SECOND,Calendar.MINUTE,Calendar.HOUR,Calendar.DAY_OF_MONTH,Calendar.MONTH.
         * 时期去整
         * 年就忽略后面的
         * 月就忽略次级的去整
         */
        sayDate(DateUtils.round(date1, Calendar.MINUTE));
        /**
         *
         */
        System.out.println("----truncate");
        sayDate(DateUtils.truncate(date1, Calendar.YEAR));
        sayDate(DateUtils.truncate(date1, Calendar.MONTH));
        sayDate(DateUtils.truncate(date1, Calendar.DAY_OF_MONTH));
        sayDate(DateUtils.truncate(date1, Calendar.HOUR_OF_DAY));
        //sayDate(DateUtils.truncate(date1, Calendar.HOUR));常量都是5与上面一样
        sayDate(DateUtils.truncate(date1, Calendar.MINUTE));
        sayDate(DateUtils.truncate(date1, Calendar.SECOND));
        /**
         * 取极限值
         * Calendar.DAY_OF_MONTH  天的最大值2015-01-30 00:00:00
         * 月的终点Calendar.MONTH
         */
        System.out.println("----ceiling");
        sayDate(DateUtils.ceiling(date1, Calendar.MONTH));
    }

    public static void say(Object o ){

        System.out.println(o);
    }
    public static void sayDate(Date d ){
        System.out.println(d);
    }
}


