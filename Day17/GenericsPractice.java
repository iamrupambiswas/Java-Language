package Day17;

public class GenericsPractice {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);
        System.out.println(intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Rupam Biswas");
        System.out.println(strBox.get());

        Integer[] nums = {1,2,3,4,5};
        String[] names = {"Tony", "Steve", "Bruce"};

        printArray(nums);
        printArray(names);
    }

    public static <T> void printArray(T[] arr) {
        for(T element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
