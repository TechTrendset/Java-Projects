public class display_array {
    public static void main(String[] args) {

        int [] number = {87,56,99,83,74,88};

        
        System.out.println("***Printing using for loop***");
      
        for(int i=0; i<number.length;i++){
            System.out.println(number[i]); // ---> Array Traverse
        }

        System.out.println("\n***Printing using for loop in reverse order***");
        for(int i=number.length -1; i>=0;i--){
            System.out.println(number[i]); // ---> Array Traverse
        }

        System.out.println("***Printing using for-each loop***");
      
       for(int element: number){
        System.out.println(element);
       }

       System.out.println("\n");

       System.out.println("***Printing i using for-each loop***");

       //declaring an array  
   int arr[]={1,2,3,3,4,5};  
   //traversing the array with for-each loop  
   for(int i:arr){  
     System.out.println(i);  
   } 
   
   System.out.println("\n");

   System.out.println("***Printing j using for-each loop***");

   

   int hello[]={11,22,33,44,55,66,77,88,99};
   for(int j :hello){
    System.out.println(j);
   }
   System.out.println("\n\n");


/* For each loop is an enhanced version of for loop.
// It travels each element of the data structure one by one.
// Note that you can not skip any element in for loop and 
it is also not possible to traverse elements in reverse order with the help of for each loop.
// It increases the readability of the code.
// If you just want to simply traverse an array from start to end 
then it is recommended to use for each loop.  */
// Syntax :
/* for (int element:Arr) {
            Sout(element);    //Prints all the elements
} */


























    }
    
}
