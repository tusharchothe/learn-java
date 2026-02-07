import java.util.Scanner;

public class twod_array {
    public static void main(String[] args) {
      //print2darray(); 
      searchX(); 
    }

    public static void print2darray(){
        Scanner sc =new Scanner(System.in);

        
        System.out.println("Enter the dimension of array =");

        int row =sc.nextInt();
        int col =sc.nextInt();

        //declare array
        int number[][] = new int[row][col];

        System.out.println("Enter element of array : ");
        //input 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                number[i][j] =sc.nextInt();
            }
        }
        System.out.println("output");
        //output
        for(int i =0;i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void searchX(){
        Scanner sc =new Scanner(System.in);
        //take input rows and cols
        System.out.println("enter the dimension :");
        int row =sc.nextInt();
        int col =sc.nextInt();
        //decalre an array
        int num[][]=new int[row][col];
        System.out.println("input array element ");
        //input array element
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                num[i][j]=sc.nextInt();
            }
        }
        //input no X to be search 
        System.out.println("enter the X to be search :");
        int X =sc.nextInt();
        //apply linear Search 
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(num[i][j]==X){
                    System.out.print("the X is found at index position ( "+i+","+j+")" );
                }
            }
        }
    }
}
