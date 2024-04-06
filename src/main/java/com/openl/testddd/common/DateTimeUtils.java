package com.openl.testddd.common;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component

public class DateTimeUtils {
    // 时间戳转换为年月日时分秒
    public static String timestampToDateTime(long timestamp) {
        if (String.valueOf(timestamp).length() == 10) {
            timestamp *= 1000;
        }
        Date date = new Date(timestamp);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }
    // 将时间戳转换为年月日模式
    public static String timestampToYMD(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date(timestamp));
    }

    // 将时间戳转换为指定格式的字符串
    public static String timestampToString(long timestamp, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date(timestamp));
    }

    // 将年月日字符串转换为时间戳
    public static long YMDToTimestamp(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateStr);
        return date.getTime();
    }

    // 将指定格式的日期字符串转换为时间戳
    public static long stringToTimestamp(String dateStr, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = sdf.parse(dateStr);
        return date.getTime();
    }

}
