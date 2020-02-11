import java.util.Scanner;

public class Ex5 {

 public static void main(String[] args) {
 	Scanner input = new Scanner (System.in);
    System.out.print("Your first number: ");
    int numb1 = input.nextInt();
    System.out.print("Your second number: ");
    int numb2 = input.nextInt();
    int result = numb1 * numb2;

   System.out.print(numb1 + " x " + numb2 + " = " +result);
  }
}
