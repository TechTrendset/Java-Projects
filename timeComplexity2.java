import java.util.Scanner;

public class timeComplexity2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)

                System.out.println("hello");
        }
        // Saarai 'i' ki values ke liye inner loop runs 'n' times.
        // nXn 
        // Worst case time complexity = O(n^2) = O(n square)
        // Worst case time complexity ---> Maximun Operations to be performed
    }

}
