import java.util.*;
public class Boundry {
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int a = dedo.nextInt();
        int b = dedo.nextInt();
        for(int i = 1;i<=a;i++){
            for(int j=1;j<=b;j++){
                if(i==1 || j==1 ||i==a || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    
}
