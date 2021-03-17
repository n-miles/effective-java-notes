package chapter2.noninstantiability;

public class TheUninstantiable {

    private TheUninstantiable() {
        System.out.println("I should not be created!");
    }

    public void method1() {
        System.out.println("How did you invoke this?");
    }

    public void method2() {
        System.out.println("This is impossible");
    }
}
