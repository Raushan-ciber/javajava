import java.util.*;
public class Fabonacii {
    public static int  facabonicNumber(int n){
       
            return facabonicNumber(n-1) + facabonicNumber(n-2);
     

    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        facabonicNumber(n);
    }
}
