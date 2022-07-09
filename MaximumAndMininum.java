package Array;

import java.util.*;

public class MaximumAndMininum {
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        int[] numbers={2,4,6,8,10};
        int max=0;
        int min=2;
        for(int i=0;i<numbers.length;i++){
          for(int j=0;j<numbers.length;j++){
            if(numbers[i]>numbers[j]){
                max =numbers[i];
            }
          }
        }System.out.println(max);
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
              if(numbers[i]<numbers[j]&& numbers[i]<min){
                min =numbers[i];
              }
            }
          }System.out.println(min);
  
    }
}
