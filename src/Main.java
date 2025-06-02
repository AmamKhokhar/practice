public class Main {
    public static void main(String[] args) {

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
        System.out.println("Overloading--------");
        c1.add(1,4);
        c1.add(4.9,8.4);
        System.out.println("-------------------");
        dog.walk();
        dog.eat();
        dog.barking();
        acc.setBalance(50000.234);
        System.out.println("Balance: "+acc.getBalance());
        t1.start();
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

    }

}