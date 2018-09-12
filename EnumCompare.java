package com.ofs.training;

enum Week {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY, 
    SATURDAY,
    SUNDAY;
}

// public class EnumCompare {
public class EnumCompare {

    // public static execute() {
    public static void main(String[] args) {

        //Week weekdays = Week.MONDAY
        Week weekdays = Week.MONDAY;
        //Week week = Week.MONDAY
        Week week = Week.MONDAY;

        // weekdays.equals(week)
        if (weekdays.equals(week)) {
            // Console console = getConsole()
            // console.print(data)
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // weekdays == week
        if (weekdays == week) {
            // Console console = getConsole()
            // console.print(data)
            System.out.println("= operator is true");
        } else {
            System.out.println("= operator is false");
        }
        System.out.println(weekdays);
    }
}
