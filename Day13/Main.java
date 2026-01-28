package Day13;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();

        try {
            p.setAge(19);

            int result = 10/0;
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Math Error: Cannot divide by zero!");
        } catch(Exception e) {
            System.out.println("General Exception!");
        } finally {
            System.out.println("Execution finished!");
        }
    }
}
