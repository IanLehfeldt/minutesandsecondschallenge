package com.ianl;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(1200));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(15467));
        System.out.println(getDurationString(-120));
        System.out.println(getDurationString(6666));
    }

    public static String getDurationString(int minutes, int seconds) {
        if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int totalHours = minutes / 60;
            int totalMinutes = minutes - ( 60 * totalHours );

            return totalHours + "h " + totalMinutes + "m " + seconds + "s";
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int convertedToMinutes = seconds / 60;
            int remainingSeconds = (seconds % 60) * 60;
            return getDurationString(convertedToMinutes, remainingSeconds);
        }
        return "Invalid value";
    }
}
