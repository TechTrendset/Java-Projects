public class sum_array {
    public static void main(String[] args) {
        // Create an array of five floats and calculate their sum.

        // float array1 []= new float [5];
        
        float [] array = {12.4f,67.7f,98.6f,74.4f,12.4f};
        float sum = 0;
        float sum1 = 0;


        for(float element: array){
            sum = sum + element;
        }

        System.out.println("The value of Sum is: "+sum);

        System.out.println("\n Can also be done as this.\n");

        for(float i: array){
            sum1 = sum1 + i;
        }

        
        System.out.println("The value of Sum is: "+sum1);





























    }
    
}
