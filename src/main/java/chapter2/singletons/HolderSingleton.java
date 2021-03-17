package chapter2.singletons;

public class HolderSingleton {

    private HolderSingleton() {
        System.out.println("HolderSingleton created");
    }

    public static HolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    public static void touch() {
        System.out.println("I've been touched");
    }

    public void print() {
        System.out.println("HolderSingleton.print() called");
    }

    private static class Holder {
        private static final HolderSingleton INSTANCE = new HolderSingleton();
    }
}
