import java.util.Arrays;

public class Program14 {
    public static void main(String[] args) {
        String s1 = "Hello i am 21 Year old Living in India";
        System.out.println(s1.substring(0,10));
        /*split Method*/
        String[]split = s1.split("\\.");
        System.out.println(Arrays.toString(split));
    }
}
