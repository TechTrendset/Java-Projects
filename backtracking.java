public class backtracking {

    public static void printPermutation(String str, String perm , int idx){

        if(str.length()==0){
            System.out.println(perm);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char currentchar = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
           
            printPermutation(newString, perm+currentchar, idx+1);


        }
    }
    public static void main(String[] args) {

        // Backtracking ---> Find all possible solutions and use the one you want.
        String str= "ABC";
        printPermutation(str, "", 0);

        



    }
    
}
