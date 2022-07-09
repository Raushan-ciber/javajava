import java.util.*;
public class Palindromicnumber {
    public static void main(String[] args) {
        Scanner ded = new Scanner(System.in);
        int n=ded.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
                
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
