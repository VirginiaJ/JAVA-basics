package pamoka2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int month = input.nextInt();
        System.out.print("Input a year: ");
        int year = input.nextInt();
        int daysOfMonth = 0;
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "January";
                daysOfMonth = 31;
                break;
            case 2:
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysOfMonth = 29;
                } else {
                    daysOfMonth = 28;
                }
                break;
            case 3:
                monthName = "March";
                daysOfMonth = 31;
                break;
            case 4:
                monthName = "April";
                daysOfMonth = 30;
                break;
            case 5:
                monthName = "May";
                daysOfMonth = 31;
                break;
            case 6:
                monthName = "June";
                daysOfMonth = 30;
                break;
            case 7:
                monthName = "July";
                daysOfMonth = 31;
                break;
            case 8:
                monthName = "August";
                daysOfMonth = 31;
                break;
            case 9:
                monthName = "September";
                daysOfMonth = 30;
                break;
            case 10:
                monthName = "October";
                daysOfMonth = 31;
                break;
            case 11:
                monthName = "November";
                daysOfMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysOfMonth = 31;
        }
        System.out.print(monthName + " " + year + " has " + daysOfMonth + " days\n");
    }
}
