package org.example;

public class WeekDays {
    private WeekDaysEnum weekDay;

    public WeekDays(WeekDaysEnum weekDay) {
        this.weekDay = weekDay;
    }

    public void dayIsNice() {
//        IF ELSE-IF ELSE
//        if (this.weekDaysEnum == WeekDaysEnum.MONDAY ) {
//            System.out.println("Bad day");
//        } else if (this.weekDaysEnum == WeekDaysEnum.FRIDAY) {
//            System.out.println("Much better");
//        } else if (this.weekDaysEnum == WeekDaysEnum.SATURDAY
//                || this.weekDaysEnum == WeekDaysEnum.SUNDAY) {
//            System.out.println("Wonderful!");
//        } else {
//            System.out.println("So-so");
//        }
//        SWITCH CASE
        switch (this.weekDay) {
            case MONDAY:
                System.out.println("Bad day");
                break;
            case FRIDAY:
                System.out.println("Much better");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Wonderful!");
                break;
            default:
                System.out.println("So-so");
                break;
        }
    }
}
