import java.util.*;
/**
 * Substring
 */
public class Substring {

    public static void main(String[] args) {
        Scanner dedo = new Scanner(System.in);
        System.out.println("enter your name");
        String name = dedo.nextLine();
      //  System.out.println(name.substring(2,5));
        System.out.println("enter your nickname");
        String nickname = dedo.nextLine();
        if(name.equals(nickname)){
            System.out.println("they are equal");
        }else{
            System.out.println("they are different");
        }

    }
}