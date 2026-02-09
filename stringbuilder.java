public class stringbuilder {
    public static void main(String[] args) {
        //declarestringbuilder();
        //appendatend();
        reversestring();
    }

    public static void declarestringbuilder(){
        StringBuilder str = new StringBuilder("tushar");
        System.out.println(str);

        // char at index 0
        System.out.println(str.charAt(0));

        // set char at index 0
        str.setCharAt(0, 'h');
        System.out.println(str);

        str.insert(1,"T");
        System.out.println(str);

        // delete the T
        str.delete(1, 2);
        System.out.println(str);
    }

    public static void appendatend(){
        StringBuilder name =new StringBuilder("h");
        name.append('e');
        name.append('l');
        name.append('l');
        name.append('o');

        System.out.println(name);
        System.out.println(name.length());
    }

    public static void reversestring(){
       StringBuilder sb = new StringBuilder("hello");

       for(int i=0;i<sb.length()/2; i++){
        int front =i;
        int back =sb.length()-1-i;

        char frontChar = sb.charAt(front);
        char backChar =sb.charAt(back);

        sb.setCharAt(front, backChar);
        sb.setCharAt(back ,frontChar);
       }
       System.out.println(sb);
    }


}
