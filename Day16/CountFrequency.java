package Day16;

import java.util.*;

public class CountFrequency {
    public static void main(String[] args) {
        String str = "askdjflsaal";
        Map<Character, Integer> freq = new HashMap<>();

        for(char ch: str.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        System.out.println(freq);
    }
}
