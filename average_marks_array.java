public class average_marks_array {
    public static void main(String[] args) {

        // Calculate the Average Marks of students in physics using array in 
        // for-each loop.

        float [] marks1 ={78.5f,67.8f,98.6f,78.4f,87.6f};
        float sum1 = 0;
        
        
        for(float element: marks1){
            sum1 = sum1 + element;
        }

        System.out.println("The Average of Marks is: "+sum1/marks1.length);

        System.out.println("\n\n");

        



      
      
      
      
      
      
      
      
      
      
      
      
      
        float [] marks ={78.5f,67.8f,98.6f,78.4f,87.6f};
        float sum = 0;
        float avg = 0;
        
        for(float element: marks){
            sum = sum + element;
            avg = (sum/5);

        }

        System.out.println("The Average of Marks is: "+avg);
        



































    }
    
}
