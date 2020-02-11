package pamoka2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = input.nextInt();
        System.out.print("Input b: ");
        int b = input.nextInt();
        System.out.print("Input c: ");
        int c = input.nextInt();

        double root = b * b - 4 * a * c;

        if (root > 0) {
            double root1 = (-b + Math.pow(root, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(root, 0.5)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (root == 0) {
            double root1 = -b / (2 * a);
            System.out.println("The root is " + root1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}
