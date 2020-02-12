package pamoka2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = input.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is a regular year");
        }
    }
}
