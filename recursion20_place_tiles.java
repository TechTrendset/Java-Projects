public class recursion20_place_tiles {

    public static int Printtiles(int n, int m) {

        if (n == m) {
            return 2;
        }

        if (n < m) {
            return 1;
        }

        // for placing tiles horizontal
        int horizontal_placements = Printtiles(n - 1, m);

        // for placing tiles vertical
        int vertical_placements = Printtiles(n - m, m);

        return horizontal_placements + vertical_placements;

    }

    public static void main(String[] args) {

        int n=4 , m=2;
        int total_tiles=Printtiles(n, m);
        System.out.println("Place tiles of size 1Xm in a floor of size nXm");
        System.out.println(total_tiles);

        // Time complexity is less because of dynamic programming.


    }

}
