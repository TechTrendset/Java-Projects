public class recursion7_stack {
    public static int stack_height(int x, int n) {

        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }

        int x_power_n_sub_1 = stack_height(x, n - 1); // recursion // work
        int x_power_n = x * x_power_n_sub_1;
        return x_power_n;

    }

    public static void main(String[] args) {

        int x = 2, n = 5;
        System.out.println("Print x^n (stack height =n)");
        System.out.println("In this case the level reached in stack is 6 ignoring the main function height.");
       
        int ans = stack_height(x,n);

        System.out.println(ans);

    }

}
