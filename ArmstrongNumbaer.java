public class ArmstrongNumbaer {
public static void main(String[] args) {
    int i=153;
    int nod=0;
    int n=i;

    while(n>0){
        
        nod++;
        n/=10;
    }
        n=i;
        int sum=0;
        while(n>0){
            int dig=n%10;

            sum=sum+dig*dig*dig;
            n/=10;
        }
        if(sum==i){
        System.out.println("armstong");
        }
        else{
            System.out.println("not armstrong");
        }

}
    
}
