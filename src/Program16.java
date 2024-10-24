public class Program16 {
    public static void main(String[] args) {
        /*Append Method*/
        StringBuffer sb1 = new StringBuffer("Hello There");
        sb1.append(" How are you ?");
        System.out.println(sb1.toString());
        /*Insert method*/
        sb1.insert(5,"!");
        System.out.println(sb1.toString());
        /*Replace method*/
        sb1.replace(5,12," ");
        System.out.println(sb1.toString());
        /*delete method*/
        System.out.println(sb1.delete(0,6));
        /*To reverse a String*/
        System.out.println(sb1.reverse());
        /*Capacity Method*/
        StringBuffer sbu = new StringBuffer();
        System.out.println(sbu.capacity());
        sbu.append("Hello");
        System.out.println(sbu.capacity());
        sbu.append("Hello i am writing 16 program of java and line number 22");
        System.out.println(sbu.capacity());
        System.out.println(sbu.length());
        sbu.ensureCapacity(35);
        sbu.append("now i am writing line number 26");
        System.out.println(sbu.capacity());


    }
}
