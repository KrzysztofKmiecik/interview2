package pl.kmk.interview;

public class temp {

    public static void main(String[] args) {

        System.out.println("kmk");

        int[] myArray={1,2,3,4,5};
        reverseInt(myArray);
        System.out.println();
        String str="OKOPa568";

        reverseString(str);

    }

    private static void reverseString(String str) {
        char[] array1= str.toCharArray();


        int len=array1.length;
        for (int i = 0; i < len/2; i++) {

            char temp=array1[i];
            array1[i]=array1[array1.length-1-i];
            array1[array1.length-1-i]=temp;
        }
        String str1=new String(array1);

        System.out.println(str1);
    }


    private static void reverseInt(int[] myArray) {
        int len= myArray.length;
        for (int i = 0; i < len/2; i++) {

            int temp= myArray[i];
            myArray[i]= myArray[myArray.length-1-i];
            myArray[myArray.length-1-i]=temp;

        }
        for (int i = 0; i < myArray.length ; i++) {
            System.out.print(myArray[i]);
        }
    }
}
