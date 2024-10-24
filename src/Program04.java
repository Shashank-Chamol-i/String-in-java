/*Implementation of equals method in program*/
public class Program04 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//True
        System.out.println(s1.equalsIgnoreCase(s2));// True
    }
}
