public class petten3 {
	public static void pattern(int n, int m) {
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++) {
                if (i == n || i == 1 || j == 1 ||  j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
         System.out.println();
            
        }
    }
public static void code(int n){
    for (int i = 1; i <= n; i++){
        // for spess print 
        for(int j = 1; j <= n-i; j++ ){
            System.out.print(" ");
        }
        // for star print
        for (int j = 1; j <= i; j++){
            System.out.print("*");
            
    }
     System.out.println();
}
}
            public static   void tringel(int n) { 
                for (int i = 1; i <= n; i++){
                    for (int j = 1; j <= n-i+1; j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }

            }

    public static void Floyd(int n){
        int number = 0;

         for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                number++;
                System.out.print(number);
            }
            System.out.println();
         }
    }

    public static void tringle0_1(int n){
        for (int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
                }
                 System.out.println();
            }
           
        }
        public static void batterfly(int n){
           // 1st harf 
          for (int i = 1; i <= n; i++){
            //for star print 
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            } for (int j =1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
          }
          // second harf 
           for (int i = n; i >= 1; i--){
        for (int j = 1; j<=i; j++){
                System.out.print("*");
            } for (int j =1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

           }
          
          } 
           




            public static void solid(int n){
                for (int i = 1; i <= n; i ++){
                    for(int j = 1; j<= (n-i); j++){
                        System.out.print(" ");
                    }for (int j = 1; j <= n; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
 
public static void hollow_rhombus(int n){
    for (int i = 1; i <= n; i++){
        for (int j = 1; j<=(n-i); j++){
            System.out.print(" ");
        }for (int j = 1; j <= n; j++){
            if (i == n || i == 1 || j == 1 || j == n){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
              
    public static void diamond(int n){
        for (int i = 1; i<= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");

            }for (int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>= 1; i--){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");

            }for (int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main (String[] args) {
 code(4);
  tringel(5);
    pattern(4, 5);
   Floyd(5);   
  tringle0_1(5);
 batterfly(4);
 solid(5);
  hollow_rhombus(5);
  diamond(4);
}
}