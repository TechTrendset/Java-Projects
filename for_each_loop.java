public class for_each_loop {
    public static void main(String[] args) {

// There is also a "for-each" loop, which is used exclusively to loop through 
// elements in an array:
// Syntax:
// for (type variableName : arrayName){
// System.out.println(variableName);
// }
 
        String [] fruits ={"apple","orange","grapes","bananas"};
        for(String i : fruits ){
            System.out.println(i);
        }

        int [] Numbers = {1,2,3,4,5,6,7,8,9,10}; 
        for(int x : Numbers){
            System.out.println(x);
        }

        int[] hj = {12,45,67,89,87,65};

        for(int i: hj){
            System.out.println(i);
        }
        





    }
    
}
