import java.util.*;

public class ifelse {
    public static void main(String[] args){
        //ifloop();
        //evenorodd();
        //comparetwonum();
        switchcase();
    
    }
    
    public static void ifloop(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your age :");
        int age = sc.nextInt();

        
        if(age>18){
            System.out.println("Adult");
        }else{
            System.out.println("not adult");
        }
    }

    public static void evenorodd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");

        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd ");
        }
    }

    public static void comparetwonum() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 =sc.nextInt();

        System.out.println("enter number 2 :");
        int num2 =sc.nextInt();
        if(num1 == num2){
            System.out.println("both are equal");
        }
        else if(num1>num2){
            System.out.println("num1 is greater");
        }
        else{
            System.out.println("num1 is lesser");
        }

    }

    public static void switchcase(){
        Scanner sc =new Scanner(System.in);
        int choice =sc.nextInt();
        
        switch(choice){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("namaste");
            break;
            case 3:System.out.println("bonjour");
            break;
            default:System.out.println("invalid choice");
        }
    }
}
