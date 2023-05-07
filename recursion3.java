public class recursion3 {
    public static void naturalNumbers(int i, int n, int sum) {

        if (i == n) {
            sum += i;
            System.out.println(sum); // base condition
            return;
        }
        sum += i; // work
        naturalNumbers(i + 1, n, sum); // recursion
        System.out.println(i);
    }

    public static void main(String[] args) {

        System.out.println("Print Natural Numbers using recursion:");
        naturalNumbers(1, 5, 0);

    }

}
