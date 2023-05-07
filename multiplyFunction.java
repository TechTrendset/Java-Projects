import java.util.Scanner;

public class multiplyFunction {
 
    public static int multiply(int a, int b){
              
       return a*b;    
    }

    public static void main(String[] args) {

        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        

        System.out.println("The product of two numbers is:"+ multiply(num1, num2));

        sc.close();



        
        
    }
    
}
