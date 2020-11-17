package pl.kmk.designpattern.Factory;

public class Factory {

   static Computer buildComputer(String name) {
        if (name.equals("Laptop")) {
            return new Laptop();
        } else if (name.equals("Desktop")) {
            return new Desktop();
        } else {
            return null;
        }
    }
}
