package pamoka2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        float num = input.nextFloat();

        if (num == 0) {
            System.out.println("Number is zero");
        } else if (num > 0) {
            if (num < 1) {
                System.out.println("Number is small positive");
            } else if (num > 1000000) {
                System.out.println("Number is large positive");
            } else {
                System.out.println("Number is positive");
            }

        } else {
            if (Math.abs(num) < 1) {
                System.out.println("Number is small negative");
            } else if (Math.abs(num) > 1000000) {
                System.out.println("Number is large negative");
            } else {
                System.out.println("Number is negative");
            }
        }
    }
}
