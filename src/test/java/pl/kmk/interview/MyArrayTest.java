package pl.kmk.interview;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MyArrayTest {

    @Test
    public void reversArrayTest(){

        MyArray myArray=new MyArray();
        int[] ints={1,2,3,4};
        int[] inputArray =myArray.reversArray(ints);

        int[] expectedArray={4,3,2,1};

        Assert.assertArrayEquals(expectedArray,inputArray);
    }


    @Test
    public void sortTest(){

        MyArray myArray=new MyArray();
        int[] ints={4,2,3,1};
        int[] inputArray=myArray.sort(ints);

        int[] expected={1,2,3,4};

        Assert.assertArrayEquals(expected,inputArray);

    }

    @Test
    public void maxTest(){
        MyArray myArray=new MyArray();
        int[] ints={3,2,1,4};
        int expected =4;
        int actual= myArray.max(ints);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void minTest(){
        MyArray myArray=new MyArray();
        int[] ints={3,2,1,4};
        int expected=1;
        int actual=myArray.min(ints);
        Assert.assertEquals(expected,actual);
    }

}