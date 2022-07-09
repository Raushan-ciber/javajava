import java.util.*;
public class Voting {
    public static void voter(int age){
        if(age>=18){
            System.out.println("yes!! you can vote");
        }
        else{
            System.out.println("no grow little more");
        }
    }
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner dx = new Scanner(System.in);
        int age = dx.nextInt();
        voter(age);
    }
    
}
