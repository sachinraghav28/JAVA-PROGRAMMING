import java.util.Scanner;
public class ThreeItemCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float b=sc.nextFloat();
        float e=sc.nextFloat();
        float tC=p+b+e;
        System.out.println("with 18%gst bill include");
        float gst=tC+(tC*0.18f);
        System.out.println(gst);
    }
    
}
