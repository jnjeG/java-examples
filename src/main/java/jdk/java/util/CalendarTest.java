package jdk.java.util;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenjunjie on 16/5/3.
 */
public class CalendarTest {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = DateUtils.toCalendar(DateUtils.addMonths(new Date(), -1));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));


        calendar = DateUtils.toCalendar(DateUtils.truncate(new Date(), Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));

        Date date = DateUtils.parseDate("2016-05-02 00:00:03", "yyyy-MM-dd hh:mm:ss");
        System.out.println(date);
        calendar = DateUtils.toCalendar(date);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));

    }
}
