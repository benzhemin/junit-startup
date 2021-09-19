package com.sam;

interface Foo {
    String method(String string);
}

public class Lambada {
    public String add(String string, Foo foo) {
        return foo.method(string);
    }

    public static void main(String[] args) {
        Lambada lam = new Lambada();
        String result = lam.add("Hello", (param) -> { 
            return param + " lambada"; 
        });

        System.out.println(result);
    }
}
