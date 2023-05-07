import java.util.Scanner;



public class factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of a Number using for loop");
        System.out.print("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac=1;
       for(int i=1; i<=n; i++){
        fac=fac*i;
       }
        System.out.printf("The Factorial of %d! is %d.",n,fac);

        System.out.println("\n************************************************\n");

        System.out.println("Factorial of a Number using while loop");
        System.out.print("Enter a Number:");
        int num = sc.nextInt();
        sc.close();
        int factorial=1;
        int i=1;
       while(i<=num){
        factorial=factorial*i;
        i++;

       }
        System.out.printf("The Factorial of %d! is %d.",num,factorial);






































    }
    
}
