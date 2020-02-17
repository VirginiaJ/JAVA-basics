package pamoka5;

import java.util.Arrays;

public class ArrayFinder {
    public static int find(int[][] matrix, int findVal) {
        // binarrySearch metodas raso, kad taikomas tiesiniams masyvams, tai siuo atveju netinka
        int i = 0;
        for (i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == findVal)
                    return i;
            }
        }
        return i;
    }

    public static int find(int[] array, int findVal) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, findVal);
        return index;
        // Anksciau naudotas metodas
//        int i = 0;
//        for (i = 0; i < array.length; i++) {
//            if (array[i] == findVal) {
//                return i;
//            }
//        }
//        return i;
    }
}
