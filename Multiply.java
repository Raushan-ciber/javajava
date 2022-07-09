import java.util.*;
public class Multiply {
    public static int multiplyOfTwoNumbers(int a,int b){
        int product = a*b;
        return product;

    }
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int a = dedo.nextInt();
        int b = dedo.nextInt();
        int mul = multiplyOfTwoNumbers(a, b);
        System.out.println(mul);
        
    }
}
