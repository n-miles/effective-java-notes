package chapter2.noninstantiability;

import java.lang.reflect.Constructor;

public class Main {

    public static void main(String[] args) throws Exception {
        Constructor<TheUninstantiable> constructor = TheUninstantiable.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TheUninstantiable instance = constructor.newInstance();

        instance.method1();
        instance.method2();
    }
}
