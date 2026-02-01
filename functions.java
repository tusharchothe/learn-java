import java.util.*;
public class functions {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the name =");
        // String name =sc.next();
        // System.out.print("enter the number 1 :");
        // int num1 =sc.nextInt();
        // System.out.print("enter the number 2 :");
        // int num2 =sc.nextInt();

        // int sum = sumoftwo(num1, num2);
        // System.out.print("the Sum of 2 numbers is "+sum+"\n");
        System.out.print("enter the number :");
        int n = sc.nextInt();
        int fa = factorial(n);
        System.out.print("the factorial of number is "+fa);


    }



    public static void printname(String name){
    
        System.out.println("Welcome "+name);
        return;
    }

    public static int sumoftwo(int num1 ,int num2){
        int s =num1+num2;
        return s;
    }

    public static int factorial(int n){
        int fact  =1;
        if(n < 0){
            System.out.println("invalid input");
            
        }

        if(n==0 || n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            fact =fact*i;

        }
        return fact;
    }


    


}
