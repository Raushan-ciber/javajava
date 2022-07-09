import java.util.*;

public class Circumfarance {
    public static double circumfaranceOfCircle(float n){
        return 3.14*2*n;

    }
    public static void main(String[] args) {
        System.out.println("enter radius");
        Scanner dedo = new Scanner(System.in);
        float n = dedo.nextFloat();
        double d = circumfaranceOfCircle(n);
        System.out.println(d);
    }
    
}
