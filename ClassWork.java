import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        // int n =1234;
        //  int sum=0;
        // while(n>0){
        //     int rev=n%10;
        //     // System.out.println(rev);
        //      sum=sum+rev;
        //      n=n/10;
        //     System.out.println(sum);
        
        // }
        // \;
        Scanner mark=new Scanner(System.in);
        int a=mark.nextInt();
        if(a>91&&a<100){
            System.out.println("grade A");
        }
        else if(a>81&&a<90){
            System.out.println("Grade B");

        }
        else if(a>71&&a<80){
            System.out.println("Grade c");
        }
        else if (a>61&&a<70){
            System.out.println("Grade D");

        }
        else
            System.out.println("sorry you are  fail");
        }
    }
    

