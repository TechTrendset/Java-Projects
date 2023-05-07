import java.util.Scanner;

public class multiplication_table2 {
    public static void main(String[] args) {
        System.out.println("***Multiplication Table using user input***\n");
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=10; i++){

            
            System.out.printf("%dx%d=%d\n",n,i,n*i);
        }
    }
    
}
