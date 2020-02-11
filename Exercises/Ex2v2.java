import java.util.Scanner;

public class Ex2v2 {
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("First number: ");
    int numb1 = input.nextInt();
    System.out.print("Second number: ");
    int numb2 = input.nextInt();
    int sum = numb1 + numb2;
    System.out.println();
    System.out.println("Sum: "+sum);
  }
}