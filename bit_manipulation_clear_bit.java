public class bit_manipulation_clear_bit{
    public static void main(String[] args) {

        // Bit Mask --> to manipulate numbers
        // step 1(Bit Mask) = 1<<position
        // step 2(operation AND with NOT) ---> Bit Mask & n(number) 


        int n = 5; //0101
        int position = 2;
        // alt 0126 = ~

        int BitMask = 1<<position;
        int notbitmask = ~(BitMask );
        int newNumber = notbitmask & n;

       System.out.println("The number set is "+newNumber);

        



    }
}