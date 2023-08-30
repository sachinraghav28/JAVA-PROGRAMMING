public class ReverseOriginal {
    public static void main(String[] args) {
    int i=10899;
    int rev=0;
    while(i>0){
        int last=i%10;
        rev=(rev*10)+last;
        i=i/10;

     }
     System.out.println(rev);
   }
    
}
