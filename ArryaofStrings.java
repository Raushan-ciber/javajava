import java.util.*;

public class ArryaofStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int totallength=0;
        String name[] = new String[size];
        for(int i=0;i<size;i++){
            name[i]= sc.next();
            totallength = totallength+ name[i].length();
           

        
          }  System.out.println(totallength);
        

    }
}
