package BOOP.B6Object;

import java.util.Objects;

public class ObjectsDemo {

    public static void main(String[] args) {
        String string=null;
        System.out.println(Objects.isNull(string));
        System.out.println(Objects.nonNull(string));
    }

}
