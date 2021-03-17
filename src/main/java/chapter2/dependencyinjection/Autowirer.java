package chapter2.dependencyinjection;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class Autowirer {

    private final Map<Class<?>, Object> cache = new HashMap<>();

    @SuppressWarnings("unchecked")
    public <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = (T) cache.get(clazz);
        if (instance != null) {
            return instance;
        }

        Constructor<T> constructor = (Constructor<T>) clazz.getConstructors()[0];

        Class<?>[] params = constructor.getParameterTypes();
        Object[] arguments = new Object[params.length];

        for (int i = 0; i < params.length; i++) {
            arguments[i] = getInstance(params[i]);
        }

        instance = constructor.newInstance(arguments);
        System.out.println("Successfully created the " + clazz.getSimpleName());
        cache.put(clazz, instance);
        return instance;
    }
}
