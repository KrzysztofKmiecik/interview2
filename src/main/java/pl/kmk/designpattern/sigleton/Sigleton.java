package pl.kmk.designpattern.sigleton;

public class Sigleton {

    private static Sigleton sigleton;

    private Sigleton() {

    }


    public static Sigleton getInstance() {
        if (sigleton == null) {
            sigleton = new Sigleton();
        }
        return sigleton;
    }
}


