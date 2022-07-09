import java.util.*;


public class Highestcommondivisor {
    public static int findHCF(int a , int b){
        int result=0;
        for(int i=a;i>=1;i--){
            
            if(a%i==0 && b%i==0){
                result = i;
                break;
            }
        }return result;
    }
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int a = dedo.nextInt();
        int b = dedo.nextInt();
        int d= findHCF(a, b);
        System.out.println(d);
        
    }
}
