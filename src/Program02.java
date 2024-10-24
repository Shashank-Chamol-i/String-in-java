public class Program02 {
    public static void main(String[] args) {
        String a = new String("Welcome");
        String b = new String ("Welcome");
        String c = new String ("Welcome");
        String d = "Welcome";

        if(c==d){
            System.out.println("Ture");
        }
        if(a==b){
            System.out.println("Same Object");
        }else{
            System.out.println("Different Object");
        }
        if(b==c){
            System.out.println("Same Object");
        }else{
            System.out.println("Different Objects");
        }

    }

}
