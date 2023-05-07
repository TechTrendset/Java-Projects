import java.util.Scanner;

public class array_in_memory {
    public static void main(String[] args) {

        // a null value is stored in the new variable inside memory.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");

        int size = sc.nextInt();

        int numbers[] = new int[size];

        // Input

        for (int i = 0; i < size; i++) {

            System.out.println("Enter the value of array:");

            numbers[i] = sc.nextInt();
         


        }

        // Output
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();

    }

}
