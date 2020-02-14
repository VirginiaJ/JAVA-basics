package pamoka3;

public class ExArray2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}};
        int stulpelio1Suma = 0;
        int stulpelio2Suma = 0;
        int stulpelio3Suma = 0;
        int stulpelio4Suma = 0;
        int stulpelio5Suma = 0;
        int eilutes1Suma = 0;
        int eilutes2Suma = 0;
        int eilutes3Suma = 0;

        // Pirmas punktas. Isvedame masyvo stulpeliu ir eiluciu sumas
        for (int i = 0; i < matrix.length; i++) {
            stulpelio1Suma += matrix[i][0];
            stulpelio2Suma += matrix[i][1];
            stulpelio3Suma += matrix[i][2];
            stulpelio4Suma += matrix[i][3];
            stulpelio5Suma += matrix[i][4];
        }

        for (int j = 0; j < matrix[0].length; j++) {
            eilutes1Suma += matrix[0][j];
        }
        for (int j = 0; j < matrix[1].length; j++) {
            eilutes2Suma += matrix[1][j];
        }
        for (int j = 0; j < matrix[2].length; j++) {
            eilutes3Suma += matrix[2][j];
        }

        System.out.println("Masyvo stulpeliu sumos: " + stulpelio1Suma + " " + stulpelio2Suma + " " + stulpelio3Suma + " " + stulpelio4Suma + " " + stulpelio5Suma);
        System.out.println("Masyvo eiluciu sumos: " + eilutes1Suma + " " + eilutes2Suma + " " + eilutes3Suma);

        // Antras punktas. Isvedame masyvo elemento, kurio reiksme 300 koordinates
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 300)
                    System.out.println("Masyvo elemento, kurio reiksme 300, koordinates: " + "[" + i + "]" + "[" + j + "]");
            }
        }
    }
}
