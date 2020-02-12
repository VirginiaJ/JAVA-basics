package pamoka2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String let = input.next().toLowerCase();
        char firstLet = let.charAt(0);
        Character letter = new Character(firstLet);

        if (Character.isLetter(letter)) {
            if (let.equals("a") || let.equals("e") || let.equals("i") || let.equals("u") || let.equals("o")) {
                System.out.println("Letter is a vowel");
            } else {
                System.out.println("Letter is consonant");
            }
        } else {
            System.out.println("Character is not a letter");
        }
    }
}
