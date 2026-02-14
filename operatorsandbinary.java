import java.util.*;

public class operatorsandbinary {
    public static void main(String[] args) {
        // getbit();
        // setbit();
        // clearbit();
        updatebitop();
    }
    
    public static void getbit(){
        int n =5;
        int pos = 2;
        int bitmask = 1<<pos;
        if((bitmask & n)==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit is one");
        }
    }

    public static void setbit(){
        int n =5;
        int pos =1;
        int bitmask =1<<pos;

        int newNumber = bitmask | n;
      
        System.out.println(newNumber);
        
    }

    public static void clearbit(){
        int n  =5;
        int pos =2;
        int bitmask =1<<pos;

        int notbitmask = ~(bitmask);
        int newNumber = notbitmask & n;
        System.out.println(newNumber);
    }

    public static void updatebitop(){
        Scanner sc  =new Scanner(System.in);
        System.out.print("enter the operation :");
        int op =sc.nextInt();

        int n=5;
        int pos =1;

        int bitmask =1<<pos;
        

        if(op == 1){
            
            int newNumber = bitmask | n;
            System.out.print(newNumber);
        }else if(op == 0){
            int notbitmask =~(bitmask);
            int newNumber = notbitmask & n;
            System.out.print(newNumber);
        }


    }
}
