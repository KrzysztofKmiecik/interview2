package pl.kmk.designpattern.observer;

import java.util.List;

public class Subject {



     Subject(List<Client> clients){

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <100 ; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                clients.stream().forEach(s-> System.out.println(s.subscribe()));



            }
        });
        thread.start();



    }

}
