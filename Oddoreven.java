import java.util.*;
public class Oddoreven {
    public static void cheakEvenOdd(int n){
        if(n%2==0){
            System.out.println(n+" is even ");
        }
        else{
            System.out.println(n+ " is odd");
        }

    }
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int n = dedo.nextInt();
        cheakEvenOdd(n);
    }
}
