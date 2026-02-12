import java.util.*;

public class operatorsandbinary {
    public static void main(String[] args) {
        getbit();
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
}
