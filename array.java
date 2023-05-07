public class array {
    public static char[] length;

    public static void main(String[] args) {

/* An array is a collection of similar types of data having 
contiguous memory allocation.
The indexing of the array starts from 0., i.e 1st element 
will be stored at the 0th index, 2nd element at 1st index, 3rd at 2nd index, 
and so on.
The size of the array can not be increased at run time therefore 
we can store only a fixed size of elements in array.
Use Case: Storing marks of 5 students  */

         /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */
        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int [] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];
         // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation and initialization together

        int [] marks = {98, 45, 79, 99, 80};


       // marks[5] = 96; - throws an error because array has length 0 till 4 index
              System.out.println(marks[4]);
              System.out.println(marks[3]);
              System.out.println(marks[2]);
              System.out.println(marks[0]);
              System.out.println("\n\n");


        int [] my_marks = new int [3];
        my_marks[0]= 98;
        my_marks[1]= 80;
        my_marks[2]= 70;

        System.out.println(my_marks[0]);
        System.out.println(my_marks[1]);
        System.out.println(my_marks[2]);
        System.out.println("\n\n");


 // System.out.println(my_marks[3]);
 // Error Index 3 out of bounds for length 3 at array

 int [] num ={45,56,78,90,76,54,32};
 System.out.println(num[0]);
 System.out.println(num[2]);
 System.out.println(num[5]);
 System.out.println(num[6]);

 System.out.println("\n\n");

 String [] cars = {"BMW","AUDI","MERCEDES","ROLLS ROYCE","TESLA"};

 // To find out how many elements an array has, use the length property:

 System.out.println(cars.length);


 for(int i=0; i<cars.length; i++){
    System.out.println(cars[i]);
 }

 System.out.println("\n\n");

 for(String i : cars){
    System.out.println(i);
 }

 System.out.println("\n\n");


 int [] numbers = {1,3,5,6,8,9,4};

 for(int i: numbers){
    System.out.println(i);
 }


   System.out.println();
 
 String [] hh = {"fghj","ftydytf","rtyuio"};
 System.out.println(hh.length);

 for(int i=0; i<hh.length; i++){
   System.out.println(hh[i]);
 }

System.out.println();


  for(String b : hh){
   System.out.println(b);
  }























        
             

    }
    
}
