public class recursion4 {
    public static void Factorial(int i, int n, int product) {

        if (i == n) {
            product *= i;
            System.out.println(product); // base condition
            return;
        }
        product *= i; // work
        Factorial(i + 1, n, product);
        System.out.println(i); // recursion
        
    }

    public static void main(String[] args) {

        System.out.println("Print Factorials using recursion:");
        Factorial(1, 5, 1);
        

    }


    
}
