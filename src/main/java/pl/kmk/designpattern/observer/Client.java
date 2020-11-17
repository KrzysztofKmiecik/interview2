package pl.kmk.designpattern.observer;

public class Client implements Subscribe {

    private final String name;

    Client(String name){
        this.name=name;
    }

    @Override
    public String subscribe() {
        return this.name + " was subscribed";
    }
}
