import java.util.*;
public class Incrementstar {
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int num = dedo.nextInt();
        for(int i =1; i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
    
}
