package com.ianl;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(60, 1));
        System.out.println(getDurationString(120, 35));
        System.out.println(getDurationString(66, 62));
        System.out.println(getDurationString(-23, 60));
        System.out.println(getDurationString(60, -54));
    }

    public static String getDurationString(int minutes, int seconds) {
        if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int totalHours = minutes / 60;
            int totalMinutes = minutes % 60 * 60;
            int totalSeconds = seconds;

            return totalHours + "h " + totalMinutes + "m " + totalSeconds + "s";
        }
        return "Invalid value";
    }
}
