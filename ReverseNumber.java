public class ReverseNumber {
    public static void main(String[] args) {
        int i=234567;
        while(i>0){
        int last=i %  10;
        System.out.print(last);
        i=i / 10;
    
        }
        System.out.println();
    }
    
}
