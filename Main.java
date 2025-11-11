import java.util.*;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Student class inherits from Person
class Student extends Person {
    int studentId;

    Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

// Teacher class inherits from Person
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayTeacherInfo() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Aman Kumar", 28, 101);
        Teacher teacher = new Teacher("Dr. Naresh", 45, "Mathematics");

        student.displayStudentInfo();
        System.out.println();
        teacher.displayTeacherInfo();
    }
}
