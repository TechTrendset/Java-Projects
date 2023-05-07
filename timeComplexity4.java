import java.util.Scanner;

public class timeComplexity4 {
    public static void main(String[] args) {

        // time complexity has a direct effect on exponential values as they are bigger

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        sc.close();

        for (int i = 0; i < n; i++) {

            System.out.println("hello");
        }

        for (int i = 0; i < m; i++) {

            System.out.println("hello");
        }
         // Worst case Time complexity = n times + m times. 
        //  there are two different loops. 
        // Worst case time complexity = O(nXm).
        // Worst case time complexity ---> Maximun Operations to be performed.


    }

}
