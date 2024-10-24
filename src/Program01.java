class String_literal{
    String a = "Welcome";
    String b  = "Welcome";
    String c = new String("Welcome");
}
public class Program01 {
    public static void main(String[] args) {
        String_literal s = new String_literal();
        if(s.c==s.b)
        {
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
