package org.example;


import javafx.util.Pair;

public class Test {
    public static void main( String[] args )
    {
        Pair<Integer, String> pair = new Pair<>(1, "One");
        Integer key=pair.getKey();
        String value=pair.getValue();
    }
}
