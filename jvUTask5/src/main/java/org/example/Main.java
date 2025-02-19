package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Injector injector = new Injector();
        MainFoo foo = injector.inject(new MainFoo());
        foo.foo();
    }
}