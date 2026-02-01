public class advpattern {
    public static void main(String[] args) {
       //butterfly(); 
       //solidrhombus();
       //numpyramidspace();
       diamond();
    }

    public static void butterfly(){
       //*      *
       //**    **
       //***  ***
       //********
       //********
       //***  *** 
       //**    **
       //*      *

       int n =4 ;
       //outer loop of first part 
       for(int i =1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

        System.out.println();
       }

// outer loop for the lower part 
       for(int i = n; i >= 1; i--){
            // stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // spaces
            for(int j = 1; j <= 2 * (n - i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
       }

    }


    public static void solidrhombus(){
        //    *****
        //   *****
        //  *****
        // *****
        //*****
        int n=5;
        //outer loop 
        for(int i =1;i<=n;i++){

            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //stars
            for(int j =1;j<=5;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void numpyramidspace(){
    //    1
    //   2 2
    //  3 3 3
    // 4 4 4 4 
    //5 5 5 5 5
    int n =5;

    //outer loop 
    for(int i=1;i<=n;i++){
        //spaces 
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //stars
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    }

    public static void palindromicpattern(){
        //    1
        //   212
        //  32123
        // 4321234
        //543212345
        int n=5;
        for(int i=1;i<=n;i++){
            //spaces 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //1st half 
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd half 
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    
        
    }

    public static void diamond(){
        //   *
        //  ***
        // *****
        //******* 
        // *****
        //  ***
        //   *

        int n=4;
        // upper half 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
