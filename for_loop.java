import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        System.out.println("Using For loop");
        for(int i=1 ; i<=10 ; i++){
            System.out.println(i);
        }
        System.out.println("******************************************************************");

        // Write a program to print first n odd numbers using a for loop.
        System.out.println("***Odd Numbers***");

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();// Number of odd numbers to be generated
        sc.close(); 
      
        for(int a=0; a<num; a++){
            System.out.println("The Odd Numbers are: "+(2*a+1));
        }


        System.out.println("***Decrement in for loop***");

        // Decrement in for loop

        for( int j=10; j>0; j--){
            System.out.println("The value is "+j);
        }

        System.out.println("******************************************************************");
        System.out.println("***First 20 Natural Numbers***");

        for( int i=20; i!=0; i--){
            System.out.println("The value is "+i);
        }


      











    }
    
}
