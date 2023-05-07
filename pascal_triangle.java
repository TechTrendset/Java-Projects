public class pascal_triangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            // first half
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                if(j==1){
                System.out.print("1");
            }
        }

        for(int j=2; j<=4; j++){
            if(j==2){
            System.out.print(j);
            }
        }

          // 2nd half numbers (backward loop)
         
                 
           System.out.println(); 
        }
    }
}