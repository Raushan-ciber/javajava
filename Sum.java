import java.util.*;
public class Sum {
    public static int  printMysum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a= dedo.nextInt();
        int b = dedo.nextInt();
        int sum = printMysum(a, b);
        System.out.println(sum);

    }
}
