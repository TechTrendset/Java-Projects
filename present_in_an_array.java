public class present_in_an_array {
    public static void main(String[] args) {
        // To find out if the given integer or float is present in an array or not.

        float [] array = {23.4f,45.7f,34.8f,67.9f,12.3f};
        float num = 45.7f;
        boolean in_array = false;

        for(float element: array){
            if(num==element){
                 
                in_array = true;
                break;
            }
        }

       

        if(in_array){
        System.out.println("The value is present in an Array.");
        }
        else
        System.out.println("The value is not present in an Array.");




































    }
    
}
