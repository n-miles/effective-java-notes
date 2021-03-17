package chapter2.builders;

public class Main {

    public static void main(String[] args) {
        ChildThing thing = new ChildThing();

        thing.sing()
                .dance();
    }
}
