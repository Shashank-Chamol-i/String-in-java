
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program13 {
    public static void main(String[] args) {
        List<String>list = Arrays.asList("Scandium", "Titanium", "Vandium", "Cromium");
        String str = list.stream().collect(Collectors.joining("|"));
        System.out.println(str.toString());
    }
}
