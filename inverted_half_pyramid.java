public class inverted_half_pyramid {
    public static void main(String[] args) {

        //  int n = 4; ---> number of lines

        for (int i = 1; i<=4; i++) {
            // spaces

            for (int j = 2 ; j <= i; j++) {

                System.out.print(" ");

            }
            for (int j = 4; j>=i; j--) {
                System.out.print(i+" ");
            }

            System.out.println();

        }

    }

}
