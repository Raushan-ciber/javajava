package Array;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        System.out.println("enter the size of aray");
        Scanner dedo= new Scanner(System.in);
        int size = dedo.nextInt();
        int num[]=new int[size];
        for(int i=0;i<size;i++){
            num[i]=dedo.nextInt();
        }
        System.out.println("enter the number you want to find");
        int findnum = dedo.nextInt();
        for(int i=0;i<num.length;i++){
            if(findnum==num[i]){
                System.out.println(i+1);
            }
        }
    }
}
