package chapter2.singletons.bad;

public class RacyLazyInstantiation {

    private static RacyLazyInstantiation instance;

    public static RacyLazyInstantiation getInstance() {
        if (instance == null) {
            // if two threads make it here at the same time, they'll both instantiate!
            instance = new RacyLazyInstantiation();
        }
        return instance;
    }
}
