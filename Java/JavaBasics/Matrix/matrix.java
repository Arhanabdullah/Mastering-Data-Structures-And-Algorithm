package JavaBasics.Matrix;

import java.util.Scanner;

public class matrix {

    public static int keySearch(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(key == matrix[i][j]){
                    System.out.println( key + " was found at position "+(i+1)+" "+(j+1));
                    return 1;
                }
            }
            System.out.println();
        }
        System.out.println("Key not found");
        return 0;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        int x = 6;
        keySearch(matrix, x);
        sc.close();
    }
}
