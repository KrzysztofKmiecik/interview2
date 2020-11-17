package pl.kmk.designpattern.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("Hello");

        List<Client> clientList = new ArrayList<>();
        clientList.add(new Client("John"));
        clientList.add(new Client("Bob"));


       Subject subject=new Subject(clientList);

    }
}
