import java.util.Scanner;


// Functions are different than Methods because they are called directly.
// Methods are called class ke objects ke through

public class factorialFunction {

    public static void printfactorial(int n) {

        if(n<0){
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {

            factorial = factorial * i;
        }

        System.out.println("The factorial of a number is: " + factorial);

        return;

        // return is not important in 'void' type.

    }

    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
       printfactorial(number);

       sc.close();

    }

}
