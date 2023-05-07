public class recursion6_fibonacci_series {
    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b; // work
        System.out.println(c);
        fibonacci(b, c, n - 1); // recursion
    }

    public static void main(String[] args) {

        int a = 0; // two numbers we already know of fibonacci series.
        int b = 1;
        int n = 7;
        System.out.println("Print the Fibonacci sequence till the nth term:");
        System.out.println(a);
        System.out.println(b);
        fibonacci(a, b, n - 2);

    }

}
