public class diamond_pattern {
    public static void main(String[] args) {


        int n=4;

        // upper part of diamond

        for(int i=1; i<=n; i++){
            
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // 1st half stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // 2nd half stars
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }   
            System.out.println();

        }

        

         // lower part of diamond
        for(int i=n; i>=1; i--){

            
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // 1st half stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // 2nd half stars
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }   
            System.out.println();
            
















        }
        
















    }
    
}
