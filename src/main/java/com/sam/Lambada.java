package com.sam;

import java.util.function.Function;

public class Lambada {
    public String add(String string, Function<String, String> foo) {
        return foo.apply(string);
    }

    public static void main(String[] args) {
        Lambada lam = new Lambada();
        Function<String, String> foo = param -> param + " lambada";
        String result = lam.add("Hello", foo);

        System.out.println(result);
    }
}
