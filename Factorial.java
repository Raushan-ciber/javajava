import java.util.*;
public class Factorial {
    public static void factorailOfANumber(int n){
        if(n<0){
            System.out.println("invalid input");
            return ;
        }
        int output =1;
        for(int i=1;i<=n;i++){
           output= output *i;
        }
       System.out.println(output);;
    }
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int n = dedo.nextInt();
        factorailOfANumber(n);
    }
    
}

