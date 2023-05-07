public class pr_02 {
    public static void main(String[] args) {
        System.out.println("***Encrypting and Decrypting the grade***");
        char grade = 'A';
        grade = (char)(grade+8); // int + char = int
                                 // solve it by type casting it into character.
        System.out.println("Encrypted Grade is " +grade);

    // Decrypting the grade
    grade = (char)(grade-8); 
    System.out.println("Decrypted Grade is " +grade);
    
        
    }
    
}
