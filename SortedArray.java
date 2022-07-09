package Array;
import java.util.*;
public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arry");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i=0;i<numbers.length;i++){
             numbers[i]=sc.nextInt();
        }
        int temp;
        for(int i=1;i<numbers.length-1;i++ ){
            for(int j=i+1;j<size;j++){
            if(numbers[j]>numbers[i]){
                temp = numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
            }
        }
        }
            
        
        for(int i=1;i<=numbers.length-1;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
