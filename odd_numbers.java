import java.util.Scanner;



public class odd_numbers {
    public static void main(String[] args) {
        System.out.println("*** Sum of Odd Numbers***");
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i =1;
        int sum = 0;

        while(i<=n) {

            sum=sum+((2*i)-1);
            i++; 
        }
        System.out.printf("The Sum of First %d Odd Numbers is %d. ",n,sum);
    }
    
}
