/*== Operator implementation */
public class Program05 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = "Hello";

        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false
        System.out.println(s3==s1);//True
    }
}
