package Day5;

public class StringPractice {
    public static void main(String[] args) {
        String s = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println(s == s2);
        System.out.println(s == s3);

        StringBuilder sb = new StringBuilder("Hello");
        sb.reverse();
        System.out.println(sb);

        String name = "Rupam Biswas";
        System.out.println(name.substring(6, name.length()));
        System.out.println(name.indexOf("Biswas"));
        System.out.println(name.contains("Java"));
    }
}
