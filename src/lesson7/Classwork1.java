package lesson7;


import lesson7.cw1.Day;

public class Classwork1 {

    public static void main(String[] args) {

        Day[] days = Day.values();

        for (Day i : days) {
            switch (i) {
                case MONDAY:
                case TUESDAY:
                case WEDNESDAY:
                case THURSDAY:
                case FRIDAY: {
                    System.out.println(i.name() + " is a working day");
                    break;
                }
                case SATURDAY:
                case SUNDAY: {
                    System.out.println(i.name() + " is a day off");
                    break;
                }
            }
        }
    }



}
