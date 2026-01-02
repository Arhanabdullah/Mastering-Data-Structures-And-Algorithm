package JavaBasics.Matrix;

import java.util.Scanner;

public class SpiralMatrix {

    public static void spiralMatrix(int matrix[][]){
        int startRow =0;
        int endRow = matrix.length-1;
        int startColumn =0;
        int endColumn =matrix[0].length-1;
        while(startRow<=endRow && startColumn <= endColumn){
            for (int j = startColumn; j <=endColumn; j++) {
                System.out.print(matrix[startRow][j]+ " ");  
            }
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn]+ " ");  
            }
            for (int j = endColumn-1; j >=startColumn; j--) {
                if(startColumn==endColumn){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");  
            }
            for (int i = endRow-1; i >= startRow+1; i--) {
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[i][startColumn]+ " ");  
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
            
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int m =  sc.nextInt();
        System.out.println("Enter Number of columns");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix entered is :");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        spiralMatrix(matrix);
        sc.close();
    }
}
