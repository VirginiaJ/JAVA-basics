package pamoka2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }
}
