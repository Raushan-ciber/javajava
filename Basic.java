import java.util.*;

public class Basic {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    //concatination
    
    System.out.println("enter your first name");
    String firstname = sc.next();
    System.out.println("enter your last name");
    String lastname = sc.next();
    String fullname = firstname + " " + lastname;
    System.out.println(fullname);
    
}
    
}