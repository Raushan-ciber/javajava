package Array;

import java.util.Scanner;

public class Hwproblems {
    public static void main(String[] args) {
        System.out.println("enter how many names do you want to print");
        Scanner dedo = new Scanner(System.in);
        int size = dedo.nextInt();
        String names[] = new String[size];
        for(int i=0;i<size;i++){
            names[i]= dedo.nextLine();

        }
        for(int i=0;i<size;i++){
            System.out.println(names[i]);
        }
    }
}
