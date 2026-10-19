public class patterns2 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++ ){
            //for space create
             for (int j =1; j <= n-i; j++){
                System.out.print(" "); }
                // for * create
                for (int j = 1; j <= i; j++ ) {
                    System.out.print("*");
                }
               // for next line
            System.out.println();

        }
    
    }
}
