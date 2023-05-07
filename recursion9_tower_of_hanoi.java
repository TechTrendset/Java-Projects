public class recursion9_tower_of_hanoi {
    public static void towerofHanoi(int n, String src, String helper, String des) {

        if (n == 1) { // base condition
            System.out.println("Transfer disk " + n + " from " + src + " to " + des);
            return;

        }

        towerofHanoi(n - 1, src, des, helper); // recursion
        System.out.println("Transfer disk " + n + " from " + src + " to " + des);
        towerofHanoi(n - 1, helper, src, des);

    }

    public static void main(String[] args) {
        System.out.println("Print the Hanoi Tower");
        int n = 3;
        towerofHanoi(n, "S", "H", "D");

    }

}
