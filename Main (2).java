import java.util.Scanner;
public class Main{
    public static void main( String []args)
    {
        Scanner sc= new Scanner (System.in);
            for( int i=1;i<=10;i++){
                    System.out.print("enter number"+i+":");
                    int n=sc.nextInt();
                    if(n==50){
                            System.out.println("your entered 50,stopping!");
                            break;
                    }
            }
    }
}
                    
            

    

