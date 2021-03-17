package chapter2.dependencyinjection.circular;

public class Root {

    private final Child1 c1;

    public Root(Child1 c1) {
        this.c1 = c1;
    }
}
