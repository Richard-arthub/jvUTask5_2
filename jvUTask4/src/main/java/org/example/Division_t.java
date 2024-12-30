package org.example;

import java.util.Random;

/**
 * Клас отражает сущность подразделения - его код и имя
 */
public class Division_t {
    private int ID;
    private char Name;

    public void setID(int id) {
        ID = id;
    }

    public void setName(char name) {
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public char getName() {
        return Name;
    }
}
