import java.util.Scanner;

public class length_of_array {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");

        int size = sc.nextInt();

        int numbers[] = new int[size];

        // Input

        for (int i = 0; i < size; i++) {

            System.out.println("Enter the value of array:");

            numbers[i] = sc.nextInt();
         


        }

        System.out.println("Enter the value of x: ");

        int x= sc.nextInt();

        // Output
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i]==x){
                System.out.println("The value of x is found at index:"+ i);
            }
        }

        sc.close();


















    }
    
}
