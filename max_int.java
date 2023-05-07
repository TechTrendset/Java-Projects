public class max_int {
    public static void main(String[] args) {

     System.out.println("***Maximum element in the array***");


        int [] array = {45,77,55,44,23,78,90,655,44,33};

        int max=0;

        for(int element:array){
            if(element>max){
               max=element;
       

            }
        }
     System.out.println("The value of the maximum element in the array is: "+max);
      
        
     System.out.println("\n\n");

     int [] array1 = {45,77,55,44,23,78,90,655,44,33};

        int max1=Integer.MIN_VALUE; // variable 'max1' is put at minimum value. 

    
     for(int element:array1){
        if(element>max1){
           max1=element;
   

        }
    }
 System.out.println("The value of the maximum element in the array is: "+max1);
   


    


















    }
    
}
