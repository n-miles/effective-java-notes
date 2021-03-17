package chapter2.dependencyinjection.users;

public class UserDao {

    private final DummyDep1 dummyDep1;
    private final DummyDep2 dummyDep2;

    public UserDao(DummyDep1 dummyDep1, DummyDep2 dummyDep2) {
        this.dummyDep1 = dummyDep1;
        this.dummyDep2 = dummyDep2;
    }

    public String getAddress(String user) {
        return user + " road";
    }
}
