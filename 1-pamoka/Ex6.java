import java.util.Scanner;

public class Ex6 {

 public static void main(String[] args) {
 	Scanner input = new Scanner (System.in);
    System.out.print("Your first number: ");
    int numb1 = input.nextInt();
    System.out.print("Your second number: ");
    int numb2 = input.nextInt();
    int sum = numb1 + numb2;
    int dif = numb1 - numb2;
    int multiplication = numb1 * numb2;
    int division = numb1 / numb2;
    int mod = numb1 % numb2;

   System.out.println(numb1 + " + " + numb2 + " = " + sum);
   System.out.println(numb1 + " - " + numb2 + " = " + dif);
   System.out.println(numb1 + " x " + numb2 + " = " + multiplication);
   System.out.println(numb1 + " / " + numb2 + " = " + division);
   System.out.println(numb1 + " mod " + numb2 + " = " + mod);
  }
}
