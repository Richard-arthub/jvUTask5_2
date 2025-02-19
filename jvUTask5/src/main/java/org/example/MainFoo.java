package org.example;

/**
 * Класс с авто инъектируемыми полями.
 */
public class MainFoo {
    @AutoInjectable
    private FirstInterface field1;

    @AutoInjectable
    private SecondInterface field2;

    public void foo() {
        field1.execute();
        field2.execute();
    }
}
