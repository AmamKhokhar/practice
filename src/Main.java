public class Main {
    public static void main(String[] args) {

        // Initializing Objects
        Car car = new Car();
        Student s1 = new Student("Amam",22,"Male");
        Calculator c1 = new Calculator();
        Dog dog = new Dog();
        Account acc = new Account();
        MyThread t1 = new MyThread();
        TestArrayList arrl = new TestArrayList();
        car.cars();
        car.bikes();
        s1.display();

        // Method Overloading
        System.out.println("Overloading--------");
        c1.add(1,4);
        c1.add(4.9,8.4);

        // Calling Function from dog class
        System.out.println("-------------------");
        dog.walk();
        dog.eat();
        dog.barking();

        // Setting Balance to Private Account
        acc.setBalance(50000.234);
        System.out.println("Balance: "+acc.getBalance());

        //Running Thread
        t1.start();

        // Insertion in ArrayList
        arrl.names.add("Amam");
        arrl.names.add("Ali");
        arrl.names.add("Ahmed");
        arrl.names.add("Subhan");
        arrl.names.add("Ali");
        arrl.names.add("Nauman");

        System.out.println("Names in the ArrayList-----------");
        for (String name : arrl.names){
            System.out.println(name);
        }

        arrl.names.remove("Subhan");
        System.out.println("After Removing Subhan: ");
        for (String name : arrl.names){
            System.out.println(name);
        }

        System.out.println("Printing Without Loop");
        System.out.println(arrl.names);
        System.out.println(arrl.names.getLast());
    }

}