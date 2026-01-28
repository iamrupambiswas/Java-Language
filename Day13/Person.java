package Day13;

public class Person {
    
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
