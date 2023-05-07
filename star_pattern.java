public class star_pattern {
    public static void main(String[] args) {
        System.out.println("***Printing the Increasing Star Pattern***");
       
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
        System.out.print("\n");
           
        }
        

        System.out.println("\n***Printing the Decreasing Star Pattern***\n");

       
        int num = 4;
        for(int i=num; i>=0; i--){
            for(int j=1; j<=i; j++ ){
                System.out.print("*");
            }
        System.out.print("\n");
           
        }

        System.out.println("\n***Printing the Decreasing Star Pattern***\n");

        for(int i=1; i<=5; i++){
            for(int j = 5; j>=i; j--){
                System.out.print("*");
            }
        System.out.print("\n");
           
        }
        System.out.println("***\nPrinting the Right side Increasing Star Pattern***\n");

        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                if((i+j)<=5)
                    System.out.print(" ");
                    else
                        System.out.print("*");              
                        
        }
        System.out.print("\n");

    } 





}

    }

    

