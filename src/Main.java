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
        TestLinkedList ll = new TestLinkedList();
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
        System.out.println();

        //Running Thread
        t1.start();

        // Insertion in ArrayList
        arrl.names.add("Amam");
        arrl.names.add("Ali");
        arrl.names.add("Ahmed");
        arrl.names.add("Subhan");
        arrl.names.add("Ali");
        arrl.names.add("Nauman");

        // Printing Names in ArrayList
        System.out.println("Names in the ArrayList-----------");
        for (String name : arrl.names){
            System.out.println(name);
        }
        System.out.println();

        // Printing Names After Removing One
        arrl.names.remove("Subhan");
        System.out.println("After Removing Subhan: ");
        for (String name : arrl.names){
            System.out.println(name);
        }

        // Printing ArrayList Without Loop
        System.out.println("Printing Without Loop: "+arrl.names);

        // Getting Last Name In The Last Index
        System.out.println("Printing City in the Last Index: "+arrl.names.getLast());

        // Insertion in LinkedList
        ll.cities.add("Lahore");
        ll.cities.add("Islamabad");
        ll.cities.add("Karachi");
        ll.cities.add("Rawalpindi");

        // Printing Cities in LinkedList
        System.out.println("Cities in the LinkedList-----------");
        for (String city : ll.cities){
            System.out.println(city);
        }
        System.out.println();

        // Printing Cities After Removing One
        ll.cities.remove("Karachi");
        System.out.println("After Removing Karachi: ");
        for (String city : ll.cities){
            System.out.println(city);
        }

        // Printing LinkedList Without Loop
        System.out.println("Printing Without Loop: "+ll.cities);

        // Getting Last City In The Last Index
        System.out.println("Printing City On Last Index: "+ll.cities.getLast());

    }

}