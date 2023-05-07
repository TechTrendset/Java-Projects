public class reverse_string {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("PAREESA");

        for(int i=0; i<name.length()/2; i++){

            int front = i;
            int back = name.length()-1-i;

            char frontChar = name.charAt(front);
            char backChar = name.charAt(back);

            // name.setCharAt(int,char); 
            name.setCharAt(front,backChar);
            name.setCharAt(back,frontChar);

        }

            System.out.println(name);



           
        }
        
    }
    

