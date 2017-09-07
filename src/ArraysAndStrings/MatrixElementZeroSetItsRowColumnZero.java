package ArraysAndStrings;

import java.util.HashSet;

public class MatrixElementZeroSetItsRowColumnZero {

    public static void main(String[] args) {
        int inputMatrix[][] = {{1, 2, 3, 4},
                {5, 7, 0, 8},
                {6, 3, 9, 0},
                {5, 4, 0, 1}};
        int N = 4;

        HashSet<Integer> rowHashSet = new HashSet<>();
        HashSet<Integer> columnHashSet = new HashSet<>();

        System.out.println("Input matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (inputMatrix[i][j] == 0) {
                    rowHashSet.add(i);
                    columnHashSet.add(j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (rowHashSet.contains(i) || columnHashSet.contains(j)) {
                    inputMatrix[i][j] = 0;
                }
            }
        }
        System.out.println("Output matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(inputMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
