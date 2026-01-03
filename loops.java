import java.util.*;
public class loops {
    public static void main(String[] args){
        //forloop();
        //countnum();
        //whileloop();
        //dowhileloop();
        //compareloop();
        //sumofn();
        //printtable();
    }
int n;
    public static void forloop(){
       for(int i =0;i<5;i++){
        System.out.println("hello");
       } 
    }

    public static void countnum(){
        for(int i =0;i<10;i++){
            System.out.print(i + " ");
        }
    }

    public static void whileloop(){
        int i =0;
        while(i<5){
            System.out.println("hello");
            i++;
        }
    }

    public static void dowhileloop(){
        int i  =0;
        do{
            System.out.println("hello");
            i++;
        }while(i<5);
    }

    public static void compareloop(){
        int i =12;
        System.out.println("this is while loop");
        while(i<11){
            System.out.println("hello");
            i =i+1;
        }
        System.out.println("below is output of dowhile loop");
        do{
            System.out.println("hello");
            i=i+1;
        }while(i<11);
    }

    public static void sumofn(){
        //1,2,3,4,.....,n
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you number :");
        int n =sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum =sum +i;
        }

        System.out.println("The sum of natural number :"+ sum);
    }

    public static void printtable(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter the number :");

        int n  = sc.nextInt();
        for(int i =1;i<11;i++){
            System.out.println(i*n);
        }

    }
}
