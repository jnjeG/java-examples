package jdk.java.util;

import org.apache.commons.lang3.time.DateUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by chenjunjie on 16/5/3.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = DateUtils.toCalendar(DateUtils.addMonths(new Date(),-1));
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}
