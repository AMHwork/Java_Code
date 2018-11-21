package com.austinhua;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(68,30));
        System.out.println(getDurationString(6059));

    }

    public static String getDurationString(int minutes, int seconds){

        String Message = "";

        if (minutes < 0 || seconds < 0 || seconds > 59){
            //System.out.println("Invalid Numbers");
            Message = "Invalid Numbers";
            return Message;

        }

        int hours = minutes / 60;
        int remainMinutes = minutes % 60;

        String formatHours = timeConvert(hours);
        String formatMinutes = timeConvert(remainMinutes);
        String formatSeconds = timeConvert(seconds);

        // format it to add 0 if its less than 10

        Message = "The time is: " + formatHours + "h " + formatMinutes + "m " + formatSeconds + "s";

        return Message;

    }

    public static String getDurationString(int seconds){

        if (seconds < 0){
            return "Invalid Numbers";
        }

        int minutes = seconds / 60;
        int remainSecs = seconds % 60;

        return getDurationString(minutes, remainSecs);

    }

    public static String timeConvert (int time){

        String formatTime = "";

        if (time < 10){
            formatTime = "0" + time;
        }
        else {
            formatTime = "" + time;
        }

        return formatTime;

    }
}
