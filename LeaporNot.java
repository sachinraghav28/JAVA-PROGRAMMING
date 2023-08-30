import java.util.Scanner;

public class LeaporNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int y =sc.nextInt();
        if(y%4==0){
            System.out.println("leap year");
        }
        else if(y%100==0){
            System.out.println("it is a leap year");
         }
        else if(y%400==0){
            System.out.println("is a laep year");
         }
        
        else{
            System.out.println("not laep year");
        }
    }
    
}
