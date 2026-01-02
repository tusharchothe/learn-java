import java.util.*;//import all the classes 
//import java.util.Scanner (import only scanner class)

public class basic{
    public static void main(String[] args){
    //   basicvar();  
        //input 
        // Scanner sc = new Scanner(System.in);
        // String name =sc.nextLine();
        // System.out.println(name);

        //nextInt()
        //nextFloat()
        printsum();

    }

    // variables in java 
    public static void basicvar(){
        String name ="tushar Chothe";
        int age =48;
        double price =25.25;
        int a =25;
        int b =45;
        System.out.println(age);

    }

    public static void printsum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the firstnumber =");
        int a = sc.nextInt();
        System.out.print("enter Second number =");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = "+sum);

    }
}
