package chapter2.builders;

public class SuperThing<T extends SuperThing<T>> {

    public T sing() {
        return getSelf();
    }

    @SuppressWarnings("unchecked")
    private T getSelf() {
        return (T) this;
    }
}
