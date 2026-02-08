import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //basicstring();
        //inputstring();
        //concat();
        //charat();
        //comparestring();
        substring();
    }

    public static void basicstring(){
        String name ="Tushar Chothe";
        System.out.println(name);
    }

    public static void inputstring(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name =sc.nextLine();

        System.out.println("Welcome " +name);

    }
    public static void concat(){
        String firstname ="Tushar";
        String lastname="Chothe";

        String fullname = firstname + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
    }

    public static void charat(){
        String name ="Vegetable";

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }

    public static void comparestring(){
        //comapre 
        String str1 ="tushar";
        String str2 ="tushar";

        //1. s1>s2  return +ve 
        //2. s1==s2  return 0 
        //1. s1<s2  return -ve 
        if(str1.compareTo(str2)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //by using equal to method 
        if(str1 == str2){
            System.out.println("strings are eaual");
        }else{
            System.out.println("Strings are not equal");
        }

        // above method is not reiable in most of the cases

        if(new String("tushar")== new String("tushar")){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }
    }

    public static void substring(){
        String sen ="my name is tushar";
        String name =sen.substring(11, sen.length());

        System.out.println(name);
    }
     
    // Strings are immutable  
    
}
