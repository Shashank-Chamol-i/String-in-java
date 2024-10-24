public class Program15 {
    public static void main(String[] args) {
        /* UpperCase and LowerCase Program Demonstration*/
        String s1 = "hello i am 21 year old living in india";
        System.out.println(s1.toUpperCase());
        String s2 = "HELLO I AM 21 YEAR OLD LIVING IN INDIA";
        System.out.println(s1.toLowerCase());
        /*Trim Method */
        String s3 = "I am trimming my Hair";
        System.out.println(s3.trim());
        /*startswith and endsWith*/
        System.out.println(s3.startsWith("I am"));
        System.out.println(s3.endsWith("ir"));
        /*charAt method*/
        System.out.println(s1.charAt(11));
        /*String length*/
        System.out.println(s1.length());
        /*intern*/
        String s4 = s1.intern();
        System.out.println(s4);
        /*valueOf convert into string*/
        boolean a = true;
        String s5 = String.valueOf(a);
        System.out.println(s5);

        String s6 = s1.replace("india","Switzerland");
        System.out.println(s6);
        
    }
}
