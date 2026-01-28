package Day5;

public class ReverseString {
    
    public static void main(String[] args) {
        String name = "Rupam Biswas";
        // System.out.println(withStringBuilder(name));
        System.out.println(withoutStringBuilder(name));
    }

    public static String withStringBuilder(String str) {
        StringBuilder newStr = new StringBuilder(str);
        return newStr.reverse().toString();
    }

    public static String withoutStringBuilder(String str) {
        String newStr = "";
        for(int i = str.length()-1;i>=0;i--){
            newStr += str.charAt(i);
        }
        return newStr;
    }

}
