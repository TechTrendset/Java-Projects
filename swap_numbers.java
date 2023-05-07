
public class swap_numbers {
    public static void main(String[] args) {
        System.out.println("Swap the numbers in an array using for each loop.***\n");
    
        //  a   b  temp
        // |2| |5| || 
        // || |5|<---|2| 
        // |5| |2| ||

        int [] array = {14,42,33,44,45,66,77,48,99};
        int L = array.length;
        int n = (int) Math.floorDiv(L,2);
        int temp;

        for(int i=0; i<n; i++){
            temp = array[i];
            array[i]=array[L-i-1];
            array[L-i-1] = temp;

        }
        for(int element: array){
            System.out.print(element + " ");
        }
        
        
       
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
