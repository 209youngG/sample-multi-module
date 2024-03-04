package com.sample.common.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TimeUtil {
    private TimeUtil() {
    }

    // 날짜 포맷을 상수로 선언
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // LocalDateTime을 String으로 변환하는 메서드
    public static String formatDate(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
        return dateTime.format(formatter);
    }

    // 현재 시간을 String으로 반환하는 메서드
    public static String getCurrentDate() {
        return formatDate(LocalDateTime.now());
    }

    // 입력된 시간을 String으로 반환하는 메서드
    public static String getInputDate(LocalDateTime dateTime) {
        return formatDate(dateTime);
    }
}
