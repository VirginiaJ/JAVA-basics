import java.util.Scanner;

public class Ex7 {
 
    public static void main(String[] arg) {
    	Scanner input = new Scanner (System.in);
    	System.out.print("Input number: ");
    	int num = input.nextInt();

    	for (int i=1; i<11; i++) {
    		System.out.println(num + " x " + i + " = " + (num * i));
    	}
    }
}
