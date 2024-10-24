

public class Program03 {
    public static void main(String[] args) {
        String name = "Brijesh";
        name.concat("Kumar Anderson");
        System.out.println(name);// Only Brijesh will get Print out cause String cannot be modified
        name = name.concat(" Kumar Anderson");// Reassignment of name variable which means there
        // Two object in the heap memory one name = Brijesh
        // Second name = Brijesh Kumar Anderson
        System.out.println(name);

    }
}
