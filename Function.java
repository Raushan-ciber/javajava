import java.util.*;

public class Function {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        System.out.println("enter your name");
        String name = dedo.nextLine();
        printMyName(name);
    }
}
