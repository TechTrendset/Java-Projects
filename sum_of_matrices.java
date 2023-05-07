public class sum_of_matrices {
    public static void main(String[] args) {

        // Add two matrices of 2X3 using 2D array.

        int [][] matrice1 = { {1,2,3},
                              {4,5,6} };

        
         int [][] matrice2 = { {7,3,2},
                               {1,4,3} };
        
        int[][] result = { {0,0,0} ,
                           {0,0,0}  };

        for(int i = 0; i<matrice1.length; i++){
        for(int j=0; j<matrice1[i].length; j++){

            System.out.format("The value of i=%d and j=%d and %d\n",i,j);
            result[i][j] = matrice1[i][j] + matrice2[i][j];


        }
        System.out.println("");

    }
        

        for(int i = 0; i<matrice1.length; i++){
        for(int j=0; j<matrice1[i].length; j++){

            System.out.print(result[i][j]+" ");
           

        }
         System.out.println("");  // Prints the new line after the row ends.
    }

        
  
      
        
                         























    }
    
}
