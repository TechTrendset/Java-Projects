import java.util.Scanner;

public class indices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of rows and columns:");

        int rows  =  sc.nextInt();
        int columns  =  sc.nextInt();
        int [][] numbers  = new int[rows][columns];

        // Input
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){

                numbers[i][j]=sc.nextInt();
            
            }
    
        }

        System.out.println("Enter the value of x:");

        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){

               if(numbers[i][j]==x){
                System.out.println("The value of x is found at i=" +i+ " and j=" +j);
               }
            }
            System.out.println();
    
        }

        sc.close();

    }
    
}
