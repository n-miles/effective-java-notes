package chapter2.singletons.bad;

public class SynchronizedLazyInstantiation {

    private static SynchronizedLazyInstantiation instance;

    public static synchronized SynchronizedLazyInstantiation getInstance() {
        // The synchronized keyword on the method fixes this, but also makes it much slower since
        // only one thread at a time can be calling this method. We can do better.
        if (instance == null) {
            instance = new SynchronizedLazyInstantiation();
        }
        return instance;
    }
}
