package chapter2.reflection;

import java.lang.reflect.Method;

public class GoodReflection {

    public static void main(String[] args) throws Exception {
        Class<?> myClass = Class.forName("chapter2.reflection.GoodReflection$MyCoolObject");

        Object instance = myClass.getConstructor().newInstance();

        System.out.println("Invoking methods on a fresh instance of " + myClass.getName());

        for (Method method : myClass.getMethods()) {
            if (method.getName().startsWith("reflectThis")) {
                Object result = method.invoke(instance);
                System.out.println(method.getName() + " returned " + result);
            } else {
                System.out.println("Not invoking " + method.getName());
            }
        }
    }

    public static class MyCoolObject {
        public String reflectThisPlease() {
            return "string 1";
        }

        public String reflectThisAlso() {
            return "second string";
        }

        public String reflectThisTooIGuess() {
            return "here's another string";
        }
    }
}
