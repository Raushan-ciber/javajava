import java.util.*;
public class Prime {
    public static int  findPrime(int n){
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
               
                return 1;
            }
        }   
        
       return 0;
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner dedo = new Scanner(System.in);
        int n = dedo.nextInt();
        if(findPrime(n)==0){
            System.out.println(n+"is prime");

        }
        else{
            System.out.println(n+"is not prime");
        }
    }
}
