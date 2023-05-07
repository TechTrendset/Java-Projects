public class recursion19_totalpaths {

    public static int totalPath(int i, int j, int n , int m){
        
        if(i==n || j==m){
            return 0; // isske baad koi path nahi hai
        }

        if(i==n-1 && j==m-1){
            return 1;    // wahin par raho
        }

        // for downward
        int down = totalPath(i+1, j, n, m);

        // for right
        int right = totalPath(i, j+1, n, m);

        return down + right;
    }
    public static void main(String[] args) {

        int n=3 , m=3;       
        int total_paths = totalPath(0, 0, n, m);
        System.out.println(total_paths);

        // Backtracking --> Exploring all the paths.
        
    }
    
}
