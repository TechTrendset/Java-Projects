import java.util.Scanner;

/*1. We will need 4 variables:
a. row_start - initialized with 0.
b. row_end - initialized with n-1.
c. column_start - initialized with 0.
d. column_end - initialized with m-1.
2. First of all, we will traverse in the row row_start from column_start
to column_end and we will increase the row_start with 1 as we have
traversed the starting row.
3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.
4. Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.
5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.
6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end.*/

public class spiral_matrix_order {

    public static void main(String[] args) {

        System.out.println("Enter the number of rows and columns: ");

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int[][] matrice = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                matrice[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");

        int rowStart = 0;
        int rowEnd = row - 1;
        int columnStart = 0;
        int columnEnd = column - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {

            for (int cols = columnStart; cols <= columnEnd; cols++) {

                System.out.print(matrice[rowStart][cols] + " ");

            }
            rowStart++;

            for (int rows = rowStart; rows <= rowEnd; rows++) {

                System.out.print(matrice[rows][columnEnd] + " ");

            }
            columnEnd--;

            for (int cols = columnEnd; cols >= columnStart; cols--) {

                System.out.print(matrice[rowEnd][cols] + " ");

            }
            rowEnd--;

            for (int rows = rowEnd; rows >= rowStart; rows--) {

                System.out.print(matrice[rows][columnStart] + " ");

            }
            columnStart++;

            System.out.println();

            sc.close(); 
        }

    }
   

}
