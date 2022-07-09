import java.util.*;
public class Avarage {
    public static int avarageOfThreeNumbers(int a,int b, int c){
        return (a+b+c)/3;
    }
public static void main(String[] args) {
    System.out.println("enter three numbers");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = avarageOfThreeNumbers(a, b, c);
    System.out.println(d);
    
}
    
}