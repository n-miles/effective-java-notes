package chapter2.dependencyinjection.users;

public class DummyDep1 {
    private final DummyDep3 dummyDep3;

    public DummyDep1(DummyDep3 dummyDep3) {
        this.dummyDep3 = dummyDep3;
    }
}
