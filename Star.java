import java.util.*;
/**
 * Star
 */
public class Star {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i=1; i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.print("*");
            }System.out.println();
        }
        }
}