package org.example;

public class MainEnum {
    public static void main(String[] args) {
//        String weekDay = "TUESDAY";
//        WeekDaysEnum weekDaysEnum = WeekDaysEnum.valueOf(weekDay);
//        WeekDays weekDays = new WeekDays(weekDaysEnum);
//        weekDays.dayIsNice();

//        values(), ordinal() и valueOf()
        WeekDaysEnum[] weekDays = WeekDaysEnum.values();

        for(WeekDaysEnum weekday: weekDays) {
            System.out.println(weekday + " at index " + weekday.ordinal());
        }
    }
}
