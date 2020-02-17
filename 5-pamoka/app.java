package pamoka5;

import pamoka5.ArrayFinder;

public class app {
    public static void main(String[] args) {
        int[] array = {5, 9, 8, 1, 99, 2, 6, 7, 3};
        int[][] matrix = {{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500, 99}};

        // Suranda tik eilutes indeksa, kurioje yra ieskoma reiksme
//        int rowIndex = ArrayFinder.find(matrix, 99);

        // Suranda reiksmes 99 indeksa surikiuotame masyve, kuri nesutampa su pradinio masyvo elemento pozicija
        int rowIndex = ArrayFinder.find(array, 99);
        System.out.println(rowIndex);
    }
}
