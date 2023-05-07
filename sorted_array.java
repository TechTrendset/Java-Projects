public class sorted_array {
    public static void main(String[] args) {

        System.out.println("***Sorted Arrays***\n");

        boolean if_sorted = true;

        int [] array = {1,2,3,4,5,6,7,8,9};

        for(int i=0; i<array.length-1; i++){

            if(array[i] > array[i+1]){  // It should be array[i] < array[i+1] 
                if_sorted = false;      // for the array to be sorted.
                break;

            }
        }
    
  if(if_sorted){
  System.out.println("The array stays the same there is no need of sorting.");
  System.out.println("The array is sorted.");

  }

  else{
    System.out.println("The array is not sorted.");
  }



  System.out.println("\n");

  boolean ifsorted = true;

  int [] array1 = {70,80,90,88,100};

  for(int i=0; i<array1.length-1;i++){

      if(array1[i] > array1[i+1]){  // It should be array[i] < array[i+1] 
          ifsorted = false;      // for the array to be sorted.
          break;

      }
  }

if(ifsorted){
System.out.println("The array stays the same there is no need of sorting.");
System.out.println("The array is sorted.\n");

}

else{
System.out.println("The array is not sorted.\n");
}












}

    
}
