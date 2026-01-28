package Day8;

public class ConstructorPractice {

    public static void main(String[] args) {
        Student s1 = new Student("Rupam Biswas", 1, 21);

        System.out.println(s1.getName());
    }
}

class Student {

    private String name;
    private int rollNumber;
    private int age;

    Student(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

}