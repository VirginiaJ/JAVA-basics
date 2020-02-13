package pamoka3;

import java.util.Scanner;

public class Kalkuliatorius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String komanda = "";

        do {
            System.out.print("Iveskite, ka norite daryti (sudeti, atimti, padalinti, padauginti, liekana, ar \"quite\" uzbaigti): ");
            komanda = input.next().toLowerCase();
            System.out.print("Iveskite pirma skaiciu: ");
            double pirmasSkaicius = input.nextDouble();
            System.out.print("Iveskite antra skaiciu: ");
            double antrasSkaicius = input.nextDouble();
            switch (komanda) {
                case "sudeti":
                    System.out.println(pirmasSkaicius + antrasSkaicius);
                    break;
                case "atimti":
                    System.out.println(pirmasSkaicius - antrasSkaicius);
                    break;
                case "padalinti":
                    System.out.println(pirmasSkaicius / antrasSkaicius);
                    break;
                case "padauginti":
                    System.out.println(pirmasSkaicius * antrasSkaicius);
                    break;
                case "liekana":
                    System.out.println(pirmasSkaicius % antrasSkaicius);
                    break;
                default:
                    System.out.println("Ivesta neteisinga komanda");
            }
        } while (!komanda.equals("quite"));
    }
}
