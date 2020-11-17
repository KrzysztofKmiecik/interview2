package pl.kmk.interview;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vactor {
    public static void main(String[] args) {
        System.out.println("Hello");
        Vector<String> vector = new Vector<String>();
        vector.add("One");
        vector.add("Two");
        vector.add("Two");

     //   vector.forEach(System.out::println);
// iterated by enum
        Enumeration en =vector.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }

//iterated by iterator
        Iterator iterator= vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
