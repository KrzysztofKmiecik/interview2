package pl.kmk.algorithms;

import java.util.HashMap;
import java.util.Map;

public class accurance {

    public static void main(String[] args) {
        String str = "lolipop";
        Map<Character, Integer> myMap = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (myMap.get(ch) == null) {
                myMap.put(ch, 1);
            } else {
                myMap.put(ch, myMap.get(ch) + 1);
            }
        }

        myMap.forEach((key, value) -> {
            System.out.println(key + " accurance " + value);
        });

    }
}
