/*Using Stringjoinner class and implementing .add()*/
import java.util.StringJoiner;

public class Program12 {
    public static void main(String[] args) {
        StringJoiner str = new StringJoiner(" ");
        str.add("Hydrogen");
        str.add("Helium");
        str.add("Lithium");
        str.add("Sodium");

        System.out.println(str.toString());
    }
}
