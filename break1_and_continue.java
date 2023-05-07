public class break1_and_continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);

        }

        System.out.println("\n\n");

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n\n");

        int i = 0;
        while (i < 10) {

            System.out.println(i);
            i++;

            if (i == 5) {
                break;
            }

        }

        System.out.println("\n\n");

        int x = 0;
        while (x < 10) {

            if (x == 5) {
                x++;
                continue;
            }

            System.out.println(x);
            x++;

        }

        System.out.println("\n\n");

        int z = 0;
        while (z < 10) {

            if (z == 7) {
                z++;
                continue;
            }
            System.out.println(z);
            z++;

        }

        System.out.println("\n\n");
        

        int a = 0;
        while (a < 10) {

            if (a == 7) {

                break;
            }
            System.out.println(a);
            a++;

        }

    }

}
