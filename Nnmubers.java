import java.util.*;
public class Nnmubers {
public static void main(String[] args) {
    int countzero=0,countpositive=0,countnegative=0;
    Scanner sc = new Scanner(System.in);
    int ans =0;
    while(ans==0){
        System.out.println("enter number");
        int a= sc.nextInt();
        if(a>0){
            countpositive++;
        }else if(a<0){
            countnegative++;
        }else{
            countzero++;
        }
        System.out.println("enter 0 for again");
         ans = sc.nextInt();

    }System.out.println("positive"+countpositive);
    System.out.println("negaitve"+countnegative);
    System.out.println("zeroes"+countzero);
    
}
}