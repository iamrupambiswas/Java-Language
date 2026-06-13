public class AutoboxingUnboxing {
    public static void main(String[] args) {

        // Autoboxing: Java automatically converts a primitive type into its wrapper class object.
        int primitiveInt = 10;
        Integer wrapperInt = primitiveInt; // Autoboxing
        System.out.println("Autoboxing: " + wrapperInt); // Output: 10

        // Unboxing: Java automatically converts a wrapper class object into its corresponding primitive type.
        Integer anotherWrapperInt = 20;
        int anotherPrimitiveInt = anotherWrapperInt; // Unboxing
        System.out.println("Unboxing: " + anotherPrimitiveInt); // Output: 20
    }
}