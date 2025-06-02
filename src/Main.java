public class Main {
    public static void main(String[] args) {
            check1();
    }
        static void check1() {
            String f = new String("amam");
            String s = new String("amam");
            System.out.println("Result of Using .equals() ");
            System.out.println(f.equals(s));
            System.out.println("Result of Using == ");
            System.out.println(f == s);
        }

}