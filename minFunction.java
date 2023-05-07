
import java.util.Scanner;

public class minFunction {

    //modifier − It defines the access type of the method and it is optional to use.

    public static int minimum(int a, int b){
        int result;
        if(a>b){
            result = b;
        }
        else{
            result = a;
        }

        return result;

    }

    public static double minimum(double a, double b){
        double result;
        if(a>b){
            result = b;
        }
        else{
            result = a;
        }

        return result;

    }

    public static void main(String[] args) {
        
    // A class has two or more methods by the same name but different parameters, is
    // known as method overloading.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two whole numbers:");

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = minimum(x, y);

        System.out.println("The result of minimum whole numbers is: "+result);
   

        System.out.println("Enter two decimal numbers:");

        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double result2 = minimum(x2, y2);

        System.out.println("The result of minimum float numbers is: "+result2);


     sc.close();

    
    
    

       

       






       

        


















    }

 
    
}
