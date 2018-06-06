package com.ianl;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(1200));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(15467));
        System.out.println(getDurationString(-120));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int minutes, int seconds) {
        if((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            int totalHours = minutes / 60;
            int totalMinutes = minutes % 60;

            String hourString = getNumberString(totalHours);
            String minuteString = getNumberString(totalMinutes);
            String secondString = getNumberString(seconds);

            return hourString + "h " + minuteString + "m " + secondString + "s";
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(int seconds) {
        if(seconds >= 0) {
            int convertedToMinutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(convertedToMinutes, remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getNumberString(int number) {
        if (number < 10) {
            return "0"+number;
        }
        return number + "";
    }
}
