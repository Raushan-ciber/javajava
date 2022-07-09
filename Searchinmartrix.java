package Array2D;
import java.util.*;
public class Searchinmartrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int colums = sc.nextInt();
        int[][] matrix = new int[rows][colums];
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the number you want to find");
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                if(x==matrix[i][j]){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
