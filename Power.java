import java.util.*;


public class Power {
    public static void powerOfNumber(int  x,int  n){
        int result=1;
       for(int i=1;i<=n;i++){
        result=result*x;
       }System.out.println(result);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of x");
      int x = sc.nextInt();
      System.out.println("enter the value of n");
      int  n = sc.nextInt();
      powerOfNumber(x, n);  
    }
}
