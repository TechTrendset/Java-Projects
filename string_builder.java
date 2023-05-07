public class string_builder {
    public static void main(String[] args) {
        // normal variables are created in stack memory
        //  heap memory stores objects
        // string builder directly linked with heap memory

        StringBuilder sb = new StringBuilder("PAREESA");
        System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0)); // prints P

        //  // replaces char at index 0
        //  sb.setCharAt(0,'F');
        //  System.out.println(sb);

          // insert char at index 0
          sb.insert(4,'O');
          System.out.println(sb);

          
        // delete the extra 'O'
          sb.delete(4,5);
          System.out.println(sb);

           // delete the 'E E'
           sb.delete(3,5);
           System.out.println(sb);

          // delete
          sb.delete(0,3);
          System.out.println(sb);


    }
    
}
