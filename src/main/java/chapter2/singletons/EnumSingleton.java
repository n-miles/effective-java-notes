package chapter2.singletons;

public enum EnumSingleton {
    INSTANCE;

    EnumSingleton() {
        System.out.println("EnumSingleton created");
    }

    public void print() {
        System.out.println("EnumSingleton.print() called");
    }

    public static void touch() {
        System.out.println("I've been touched");
    }
}
