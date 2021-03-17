package chapter2.dependencyinjection.users;

public class DummyDep2 {
    private final DummyDep3 dummyDep3;

    public DummyDep2(DummyDep3 dummyDep3) {
        this.dummyDep3 = dummyDep3;
    }
}
