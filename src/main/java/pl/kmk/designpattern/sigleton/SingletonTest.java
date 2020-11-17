package pl.kmk.designpattern.sigleton;

public class SingletonTest {
    public static void main(String[] args) {
        Sigleton sigleton=Sigleton.getInstance();
        System.out.println(sigleton);


        Sigleton sigleton1=Sigleton.getInstance();
        System.out.println(sigleton1);

    }
}
