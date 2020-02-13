package pamoka3;

public class ExArray1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Pirmas punktas. Nustatome ar seka dideja, mazeja, ar nei vienas is variantu
        boolean dideja = false;
        boolean mazeja = false;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                dideja = true;
            } else if (numbers[i] > numbers[i + 1]) {
                mazeja = true;
            }
        }

        if (dideja)
            System.out.println("Didejanti seka");
        else if (mazeja)
            System.out.println("Mazejanti seka");
        else
            System.out.println("Masyvas nei didejantis, nei mazejantis");

        // Antras punktas. Isvedame masyvo elementus atvirkstine tvarka
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        // Trecias punktas. Ivedame masyvo elemento, kurio reiksme 5 indeksa
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 5)
                System.out.println("Masyvo elemento, kurio reiksme yra 5, indeksas: " + i);
        }

        // Ketvirtas punktas. Isvedame kas antra masyvo elementa
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0)
                System.out.println(numbers[i]);
        }

    }
}
