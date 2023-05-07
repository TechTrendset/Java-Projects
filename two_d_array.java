
import java.util.Scanner;

public class two_d_array {
    public static void main(String[] args) {
        
        // int [][] num = {{13,24,30}, {42,57,69,77}};
        // // System.out.println(num[0][0]);
        // // System.out.println(num[0][1]);
        // // System.out.println(num[0][2]);
        // // System.out.println(num[1][0]);
        // // System.out.println(num[1][1]);
        // // System.out.println(num[1][2]);
        // // System.out.println(num[1][3]);

        // for(int i=0; i<num.length; i++){
        //     for(int j=0; j<num[i].length; j++){
        //         System.out.println(num[i][j]);
        //     }
        // }

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of rows and columns: ");

        int rows = sc.nextInt();

        int columns = sc.nextInt();

        int [][] numbers = new int [rows] [columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
               numbers[i][j]=sc.nextInt();
            }
        }


        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
               System.out.print(numbers[i][j]+" ");

            }
            System.out.println();
        }
         
        sc.close();



        

    }
    
}
