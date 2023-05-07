

public class pattern4_180_degree_triangle {
    public static void main(String[] args) {
        int n=4;


            // outer loop
        for(int i=1; i<=n; i++ ){
            // innerloop --> space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
                // innerloop --> star print
                for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }


        }


    }

