import javax.sound.midi.Soundbank;

public class Student {

    String name;
    int age;
    String gender;

    Student(String studentname, int studentage , String studentgender){
        name = studentname;
        age = studentage;
        gender = studentgender;
    }
    void display(){
        System.out.println("Student Details----------");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
