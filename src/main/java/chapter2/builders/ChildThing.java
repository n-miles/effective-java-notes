package chapter2.builders;

public class ChildThing extends SuperThing<ChildThing> {

    public ChildThing dance() {
        return this;
    }
}
