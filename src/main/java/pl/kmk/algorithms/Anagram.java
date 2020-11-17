package pl.kmk.algorithms;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println(isAnagram(str1, str2));
    }

    public static boolean isAnagram(String str1, String str2) {

        if((str1==null)||(str2==null)){
            return false;
        }

        if(str1.length()!=str2.length()){
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return new String(array1).equals(new String(array2));

    }

}
