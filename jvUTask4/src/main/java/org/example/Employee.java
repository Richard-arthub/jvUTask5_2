package org.example;

public class Employee {

    private int ID;
    private String Name;
    private String Gender; //bool?
    private Division_t Division;
    private int Salary;
    private int BirthdayDate;

    public void setBirthdayDate(int birthdayDate) {
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
}

