public class recursion8_stack_log {
    public static int stack_height(int x, int n) {

        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }

        if (n % 2 == 0) { // if n is even
            return stack_height(x, n / 2) * stack_height(x, n / 2);
        } else { // if n is odd
            return stack_height(x, n / 2) * stack_height(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println("Print x^n (stack height = logn)");

        int ans = stack_height(x, n);

        System.out.println(ans);

    }

}
