public class Halfpyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            } 
            System.out.println();      
        }
    }
}
