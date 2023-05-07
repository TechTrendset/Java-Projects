import java.util.Scanner;


public class even_numbers {
    public static void main(String[] args) {
        System.out.println("*** Sum of Even Numbers***");
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i =1;
        int sum = 0;

        while(i<=n) {

            sum=sum+(2*i);
            i++; 
        }
        System.out.printf("The Sum of First %d Even Numbers is %d. ",n,sum);



    















    }
    
}
