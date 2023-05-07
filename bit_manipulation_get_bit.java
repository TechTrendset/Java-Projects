public class bit_manipulation_get_bit{
    public static void main(String[] args) {

        // Bit Mask --> to manipulate numbers
        // step 1(Bit Mask) = 1<<position
        // step 2(operation AND) ---> Bit Mask & n(number) 


        int n = 5; //0101
        int position = 2;

        int BitMask = 1<<position;

        if((BitMask & n)==0){
            System.out.println("The bit was zero.");
        }else{
            System.out.println("The bit was one.");
        }
        



    }
}