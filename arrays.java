import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
      //definearray();
      //inputarray();
      searchx();
    }
    
    public static void definearray(){
        int marks[] =new int[3];
        marks[0]=98;
        marks[1]=89;
        marks[2]=95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i =0;i<3;i++){
            System.out.println(marks[i]);
        }
    }

    public static void inputarray(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter size of array =");
        int size =sc.nextInt();

        int marks[]=new int[size];

        //take input
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        //print that array;
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }

    public static void searchx(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array =");

        int size=sc.nextInt();

        //declare a array 
        int num[]=new int[size];

        System.out.println("enter element of array :");

        for(int i=0;i<num.length;i++){
            num[i] =sc.nextInt();
        }

        
        System.out.print("Enter number to be search :");
        int x =sc.nextInt();

        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                System.out.println("the x is found at index "+ i);
            }
        }
        
    }
    
}
