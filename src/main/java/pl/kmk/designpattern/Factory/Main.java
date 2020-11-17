package pl.kmk.designpattern.Factory;

public class Main {
    public static void main(String[] args) {

        Computer computer = Factory.buildComputer("Desktop");
        System.out.println(computer.getName());
    }
}
