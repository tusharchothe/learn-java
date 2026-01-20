public class advpattern {
    public static void main(String[] args) {
       //butterfly(); 
       //solidrhombus();
       numpyramidspace();
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
}
