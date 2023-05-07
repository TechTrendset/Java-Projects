import java.util.Scanner;

public class sumFunction {

    public static int sum(int a, int b){
        int c = a+b;
        
        return c;
    }
    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int Sum = sum(num1, num2);

        System.out.println("The Sum of two numbers is:"+Sum);

        sc.close();

        

    }
    
}
