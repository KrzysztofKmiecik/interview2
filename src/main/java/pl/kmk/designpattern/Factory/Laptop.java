package pl.kmk.designpattern.Factory;

public class Laptop implements Computer {
    @Override
    public String getName() {
        return "Laptop was built";
    }
}
