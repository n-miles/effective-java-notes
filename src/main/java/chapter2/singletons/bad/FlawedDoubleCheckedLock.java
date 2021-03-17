package chapter2.singletons.bad;

public class FlawedDoubleCheckedLock {

    private static FlawedDoubleCheckedLock instance;

    public static FlawedDoubleCheckedLock getInstance() {
        if (instance == null) {
            synchronized (FlawedDoubleCheckedLock.class) {
                if (instance == null) {
                    // Still unsafe!
                    // The write to instance can occur before the new FlawedDoubleLock is fully initialized!
                    // This can be safe, but only if ALL fields of FlawedDoubleLock are final.
                    instance = new FlawedDoubleCheckedLock();
                }
            }
        }
        return instance;
    }
}
