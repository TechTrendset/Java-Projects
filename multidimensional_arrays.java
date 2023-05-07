public class multidimensional_arrays {
    public static void main(String[] args) {
        // int [] flat = new int [5]; 1D Array
        // int [][] flats = new int [2][3]; 2D Array

        int[][] flats = new int[2][3];
        flats[0][0] = 340;
        flats[0][1] = 510;
        flats[0][2] = 602;
        flats[1][0] = 310;
        flats[1][1] = 211;
        flats[1][2] = 912;

        System.out.println("***Printing 2D Arrays***");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {

                System.out.print(flats[i][j]);
                System.out.print("  ");

            }

            System.out.print("\n");

        }

        int [] [] hello = {{1,2,3},
                           {4,5,6}} ;

        for(int i=0; i<hello.length; i++){
            for(int j=0; j<hello[i].length; j++){
                System.out.print(hello[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
