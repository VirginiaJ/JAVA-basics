package pamoka3;

import java.util.Scanner;

public class Kalkuliatorius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String komanda = "";
        String testi = "";

        do {
            System.out.print("Iveskite, ka norite daryti (sudeti, atimti, padalinti, padauginti, liekana): ");
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
            System.out.print("Ar norite testi (y/n) : ");
            testi = input.next().toLowerCase();
        } while (testi.equals("y"));
    }
}
