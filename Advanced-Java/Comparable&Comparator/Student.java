package Comparable&Comparator;

public class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age) {
        this.age=age;
    }

    @Override
    public int compareTo(Student s) {
        return this.age - s.age;    //ascending order
    }
    
}
