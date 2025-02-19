package org.example;

import java.util.Date;

/**
 * Классс отражает сущность рабочего, инфомрацию о нём
 */
public class Employee {

    private int ID;
    private String Name;
    private String Gender; //bool?
    private Division_t Division;
    private int Salary;
    private String BirthdayDate;

    /**
     * Конструктор с заданием всех параметров сущности рабочего
     *
     * @param id идентификационный номер рабочего
     * @param name имя рабочего
     * @param gender пол рабочего
     * @param divId номер подразделения рабочего
     * @param divName название подразделения рабочего
     * @param salary зарплата рабочего
     * @param birthdayDate день рождения рабочего
     */
    Employee(int id, String name, String gender, int divId, char divName, int salary, String birthdayDate)
    { ID = id; Name = name; Gender = gender; Salary = salary; BirthdayDate = birthdayDate; Division = new Division_t();
        Division.setID(divId); Division.setName(divName);
    }

    public void setBirthdayDate(String birthdayDate) {
        BirthdayDate = birthdayDate;
    }

    public void setDivision(char name, int id) {
        Division.setName(name);
        Division.setID(id);
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }


    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getBirthdayDate() {
        return BirthdayDate;
    }

    public Division_t getDivision() {
        return Division;
    }

    public int getSalary() {
        return Salary;
    }

    public String getGender() {
        return Gender;
    }
}

