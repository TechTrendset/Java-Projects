import java.util.Scanner;

public class transpose_matrix {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows and columns: ");

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
   
        int matrix[][] = new int[row][column];
        for(int i=0; i<row; i++) {
             for(int j=0; j<column; j++) {
                 matrix[i][j] = sc.nextInt();
             }
        }

        System.out.println("The Transpose Order Matrix is : ");

        for(int j=0; j<column; j++) {
            for(int i=0; i<row; i++) {
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println();
            sc.close();
       } 
    }
    
}
