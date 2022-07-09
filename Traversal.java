package Array2D;
import java.util.*;
public class Traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = sc.nextInt();
        System.out.println("enter colums");
        int cols = sc.nextInt();
        int[][] matrix= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 matrix[i][j] = sc.nextInt();

            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                 System.out.print(matrix[i][j]+ " ");

            }System.out.println();
        }


    }
}
