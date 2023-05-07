public class min_int {
    public static void main(String[] args) {

     System.out.println("***Minimum element in the array***");


        int [] array ={34,56,78,98,76,54,32,11,10};

        int min=Integer.MAX_VALUE; // variable 'min' is put at maximum value. 

        for(int element: array){

            if(element < min){
                min = element;
            }
        }

        System.out.println("The Minimun value in the array is: "+min);

     System.out.println("\n\n");

     int [] array1 ={34,56,78,98,76,54,32,11,10};

     int min1=20000000; // variable 'min' is put at maximum value. 

     for(int element: array1){

         if(element < min1){
             min1 = element;
         }
     }

     System.out.println("The Minimun value in the array1 is: "+min1);



        














































    }
    
}
