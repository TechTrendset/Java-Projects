public class break_continue2 {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            
            if(i==5){
            System.out.println("We skip iteration 5.");
            continue;
            }
            System.out.println(i);
            System.out.println("The loop is working");
           
        }
        System.out.println("The loop ends here.");

        System.out.println("*************In while loop*******************");
        int j=0;
        while(j<10){
            j++;
            if(j==5){
            System.out.println("We skip iteration 5.");
            continue;
            }
           System.out.println(j);
           System.out.println("The while loop is working");   
        } 
        System.out.println("The loop ends here.");
        


        System.out.println("*************In do-while loop*******************");
        int a=0;
        do{  
            a++;
            if(a==7){
            System.out.println("We skip iteration 7.");
            continue;
            }
            System.out.println(a);
            System.out.println("The do-while loop is working");   
        }while(a<10);
        System.out.println("The loop ends here.");















    }
    
}
