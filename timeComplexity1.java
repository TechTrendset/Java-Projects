import java.util.Scanner;

// We always talk in worst case complexity to arrange things 
// in a systematic manner.

public class timeComplexity1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){

            System.out.println("hello");
        }

        sc.close();

        // Agar input 'n' hai toh number of operation bhi 'n' hai.
        // time complexity is the number of operations.
        // time complexity is directly proportional to input 'n'.

        // 1.Best Case: 1 operation = 1 unit of time
        // 2.Average Case: (sum of total operations / n) 
        //  (n+1)/2 {Average of space complexity}  
        // 3. Worst Case: time complexity directly proportional to input size 'n' 
        






















    }
    
}
