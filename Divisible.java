import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    
         if(n%3==0 && n%5==0){
            System.out.println("fizz buzz");
         }
         else if(n%3==0){
            System.out.println("fizz");
         }
         else if(n%5==0){
            System.out.println("buzz");
        }
        else{
            System.out.println(n);
        }
    }
}
    