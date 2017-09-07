package ArraysAndStrings;

public class RotateImageNintyDegrees {

    public static void main(String[] args) {

        int image[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int N = 4;

        System.out.println("Image matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                image[i][N - 1 - j] = image[j][i];
            }
        }

        System.out.println("Image matrix after rotating each pixel to 90 degrees");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
