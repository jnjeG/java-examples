package jdk.java.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by chenjunjie on 16/5/2.
 * 原博客地址：http://www.cnblogs.com/e241138/archive/2012/05/15/2501458.html
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) throws IOException, ParseException {
        // TODO Auto-generated method stub
        SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请键入日期（如：2008-8-8）：");
        String str = br.readLine();
        Date date = dateFormatter.parse(str);
        dateFormatter.applyPattern("D");//
        System.out.println("一年中的第几天：" + dateFormatter.format(date));

        dateFormatter.applyPattern("d");
        System.out.println("一个月中的第几天：" + dateFormatter.format(date));

        dateFormatter.applyPattern("w");
        System.out.println("一年中的第几周：" + dateFormatter.format(date));

        dateFormatter.applyPattern("W");
        System.out.println("一个月中的第几周：" + dateFormatter.format(date));

        dateFormatter.applyPattern("E");
        System.out.println("一个星期中的天数：" + dateFormatter.format(date));

        dateFormatter.applyPattern("m");
        System.out.println("一个小时中的的分钟数：" + dateFormatter.format(date));

        br.close();

    }
}
