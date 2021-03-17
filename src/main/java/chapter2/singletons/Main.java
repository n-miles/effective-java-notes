package chapter2.singletons;

import com.google.i18n.phonenumbers.PhoneNumberUtil;

public class Main {

    public static void main(String[] args) {
        System.out.println("Started program");
        System.out.println();

        EnumSingleton.touch();
        EnumSingleton.INSTANCE.print();

        System.out.println();

        HolderSingleton.touch();
        HolderSingleton.getInstance().print();
    }
}
