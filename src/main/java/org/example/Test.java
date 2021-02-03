package org.example;


import javafx.util.Pair;

public class Test {
    public static void main( String[] args )
    {
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Integer, String> pair2 = new Pair<>(2, "two");
        Pair<Pair<Integer, String>,Pair<Integer, String>> pair3=new Pair<>(pair1,pair2);
        System.out.println(pair3.toString());
        //Pair<Integer, String> pair = new Pair<>(1, "One");
        //Integer key=pair.getKey();
        //String value=pair.getValue();
    }
}
