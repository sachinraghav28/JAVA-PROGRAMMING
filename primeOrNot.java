public class primeOrNot {
    public static void main(String[] args) {
      int n=6;
            if(n==2){
                System.out.println("n is prime");
            }else{
            boolean Isprime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                 
                   
                   Isprime=false;
                 }
            }
            if(Isprime==true){
                System.out.println("n is prime");
            }
            else{
                System.out.println("n in not prime");
            }
           
        }


        
    }
}
    

