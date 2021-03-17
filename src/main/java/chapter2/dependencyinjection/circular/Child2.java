package chapter2.dependencyinjection.circular;

public class Child2 {
    private final Child3 favoriteSibling;

    public Child2(Child3 favoriteSibling) {
        this.favoriteSibling = favoriteSibling;
    }
}
