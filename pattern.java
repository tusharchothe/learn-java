public class pattern {
    public static void main(String[] args){
        //rectpattern();
        //hollowrect();
        //halfpyramid();
        //invertedhalfpyramid();
        //halfnumpyramid();invertednumpyramid
        //invertedhalfnumpyramid();
        //floydtriangle();
        zeroonetriangle();
    }

    public static void rectpattern(){
        //****
        //****
        //****
        int m =3;
        int n= 4;
        //outer loop
        for(int i =1;i<=m;i++){
            //inner loop
            for(int j =1;j<= n;j++){
                System.out.print("*");
            }
        System.out.println();    }
    }

    public static void hollowrect(){
        //*****
        //*   *
        //*   *
        //*****
        int n =4;
        int m =5;

        //outer loop
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 ||i==n||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void halfpyramid(){
        //*
        //**
        //***
        //****


        int n =4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }    
        System.out.println();    
        }
    }

    public static void invertedhalfpyramid(){
        //   *
        //  **
        // ***
        //**** 

        // outer loop 
        int n=4;
        for(int i=1;i<=n;i++){

            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfnumpyramid(){
        //1
        //12
        //123
        //1234
        //12345

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invertedhalfnumpyramid(){
        //12345
        //1234
        //123
        //12
        //1

        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydtriangle(){
        //1
        //23
        //456
        //789 10
        int n=4;
        int num =1;
        for(int i=1;i<=n;i++){
           for(int j=1;j<=i;j++){
            System.out.print(num);
            num =num+1;

           } 
           System.out.println();
        }
    }

    public static void zeroonetriangle(){
        //1
        //01
        //101
        //0101
        //10101
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
