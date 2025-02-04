import java.util.Scanner;
public class prime {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);{
            System.out.println("Entr the nmber");
            int a;
            a= sc.nextInt();
            if( a%2==0){
                     System.out.println("the number is prime number");
                  }
              else  {
                 System.out.println("the number is not primr number");
            }
        }
    }
}
