import java.util.*;
public class Table {
    public static void printTable(int n){
        for(int i=1;i<11;i++){
            System.out.println(i*n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner dedo = new Scanner(System.in);
        int n = dedo.nextInt();
        printTable(n);
    }
}
