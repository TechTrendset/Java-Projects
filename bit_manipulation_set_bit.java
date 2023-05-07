public class bit_manipulation_set_bit {
    public static void main(String[] args) {
         // step 1(Bit Mask) = 1<<position
        // step 2(operation OR) ---> Bit Mask & n(number) 

        int n=5;
        int position = 2;
        int bitmask = 1<<position;

       int newNumber = bitmask | n;

       System.out.println("The number set is "+newNumber);

    }
    
}
