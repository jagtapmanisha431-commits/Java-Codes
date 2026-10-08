import java.util.Scanner;
public class main{
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter n=");
        int n = sc. nextInt();
        int sum = 0;
        for( int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("\nsum is:"+sum);
    }
}
