public class break_continue {
    public static void main(String[] args) {
        System.out.println("***Break and Continue statements in java***");
        for(int i=0; i<10; i++){
            System.out.println(i);
            System.out.println("The loop is working");
            if(i==5){
            System.out.println("The loop ends here.");
            break;
            }
           
        
        }
        System.out.println("The Control is sent outside the loop after break.");

        System.out.println("*************In while loop*******************");
        int j=0;
        while(j<10){
            System.out.println(j);
            System.out.println("The while loop is working");
            if(j==5){
            System.out.println("The while loop ends here.");
            break;
            }
           j++;   
        }
        System.out.println("The Control is sent outside the loop after break.");
        


        System.out.println("*************In do-while loop*******************");
        int a=0;
        do{
            System.out.println(a);
            System.out.println("The do-while loop is working");
            if(a==7){
            System.out.println("The do-while loop ends here.");
            break;
            }
           a++;   
        }while(a<10);
        System.out.println("The Control is sent outside the loop after break.");










       



        
    }
    
}
