package pl.kmk.interview;

import java.util.Arrays;

public class MyArray {


    public int[] reversArray(int[] ints) {

  /*      int length = ints.length;
        int[] revereInts = new int[length];
        for (int i = 0; i < length; i++) {
            revereInts[i] = ints[length - 1 - i];
        }
        return revereInts;*/


        int length = ints.length;
        for (int i = 0; i < length / 2; i++) {
            swap(ints, i);
        }

        return ints;
    }

    private void swap(int[] ints, int i) {
        int temp = ints[i];
        ints[i] = ints[ints.length - 1 - i];
        ints[ints.length - 1 - i] = temp;
    }

    public int[] sort(int[] ints) {
        Arrays.sort(ints);
        return ints;

    }

    public int max(int[] ints) {
        Arrays.sort(ints);
        return ints[ints.length - 1];
    }


    public int min(int[] ints) {
        Arrays.sort(ints);
        return ints[0];
    }
}

