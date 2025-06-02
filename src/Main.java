public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Student s1 = new Student("Amam",22,"Male");
        car.carDetails();
        s1.display();
//        check1();
//        add(1 ,4 );
//        add(2.3,3.2);

    }
        static void check1() {
            String f = new String("amam");
            String s = new String("amam");
            System.out.println("Result of Using .equals() ");
            System.out.println(f.equals(s));
            System.out.println("Result of Using == ");
            System.out.println(f == s);
        }
        static void add(int a, int b){
            System.out.println(a+b);
        }
        static void  add(double a,double b){
            System.out.println(a + b);
        }



}