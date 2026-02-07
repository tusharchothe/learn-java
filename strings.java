import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        //basicstring();
        //inputstring();
        //concat();
        charat();
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
    
}
