public class recursion12_sorted_array {
    public static boolean IsSorted_array(int arr[],int index){

        if(index==arr.length-1){ // base condition
            return true;
        }

        if(arr[index]>=arr[index+1]){
            // array is unsorted.
            return false;
        }else{
            return IsSorted_array(arr, index+1);
        }
    

    }
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};
        System.out.println( IsSorted_array(arr, 0));

        // time complexity = string length()
        // time complexity = O(n) where n is strings length.
       
        
    }
    
}
