package chapter2.dependencyinjection.circular;

public class Child3 {
    private final Child1 favoriteSibling;

    public Child3(Child1 favoriteSibling) {
        this.favoriteSibling = favoriteSibling;
    }
}
