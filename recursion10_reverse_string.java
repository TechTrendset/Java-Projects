public class recursion10_reverse_string {
public static void print_reverse(String str , int index){

    if(index==0){
        System.out.print(str.charAt(index));
        return;
    }

    System.out.print(str.charAt(index));
    print_reverse(str, index-1);
}

    public static void main(String[] args) {
        String str = "abcd";
        print_reverse(str, str.length()-1);
        
    }

    // time complexity = string length()
    // time complexity = O(n) where n is strings length.
}
