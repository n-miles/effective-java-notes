package chapter2.dependencyinjection.circular;

public class Child1 {

    private final Child2 favoriteSibling;

    public Child1(Child2 favoriteSibling) {
        this.favoriteSibling = favoriteSibling;
    }
}
