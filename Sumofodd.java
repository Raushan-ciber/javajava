import java.util.*;
public class Sumofodd {
    public static int sumOfOddNumbers(int n){
        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum +i;

            }
        
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d= sumOfOddNumbers(n);
        System.out.println(d);
        
    }
}
