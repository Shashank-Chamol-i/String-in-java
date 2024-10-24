/*Use of String.join()*/
public class Program11 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String ("I am 21 Year Old name Bob");
        String s3 =  String.join(" ",s1,s2);
        System.out.println(s3.toString());
        String s4 = new String("My pet Name is Bruice : ");
        String s5 = String.join(" # ",s3,s4);
        System.out.println(s5.toString());
    }
}
