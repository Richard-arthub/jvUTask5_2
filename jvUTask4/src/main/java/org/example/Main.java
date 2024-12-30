package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeLoader loader = new EmployeeLoader();
        List<Employee> emList = loader.getEmployeeList("src/main/resources/foreign_names.csv");
    }
}