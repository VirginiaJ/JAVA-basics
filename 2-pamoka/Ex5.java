package pamoka2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the day number: ");
        int day = input.nextInt();
        String dayName = "";

        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default: dayName = "Invalid input";
        }
        System.out.println(dayName);
    }
}
