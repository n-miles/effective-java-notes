package chapter2.reflection;

import java.lang.reflect.Field;

public class BadReflection {

    public static void main(String[] args) throws Exception {
        String hello = "hello";
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        byte[] value = (byte[]) valueField.get(hello);
        value[0] = 'b';
        value[1] = 'y';
        value[2] = 'e';
        value[3] = ' ';
        value[4] = ' ';

        System.out.println(hello);
        System.out.println("hello");
    }
}
