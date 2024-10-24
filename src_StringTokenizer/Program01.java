
import java.util.StringTokenizer;


public class Program01 {
    public static void main(String[] args) {
        /*.nextToken()*/
        StringTokenizer str = new StringTokenizer("Hello I am a Java Developer");
        System.out.println(str.countTokens());
        while(str.hasMoreTokens())
        {
            System.out.println(str.nextToken());
        }


    }
}
