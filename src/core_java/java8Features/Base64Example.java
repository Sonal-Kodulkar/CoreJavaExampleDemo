package core_java.java8Features;

import java.util.Base64;

public class Base64Example {
    String name, encodedValue;

    public void encodeString1(String name) {
        this.name = name;
        //encodedValue = Base64.getDecoder().encodeToString("name".getBytes());

    }

    public void decodeString() {
        byte[] actualString = Base64.getDecoder().decode(encodedValue);
    }

}
