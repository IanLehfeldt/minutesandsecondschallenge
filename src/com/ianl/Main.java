package com.ianl;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(60, 1));
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
