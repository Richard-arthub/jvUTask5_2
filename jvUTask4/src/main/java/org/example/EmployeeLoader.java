package org.example;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.io.File.separator;
import static org.apache.commons.lang3.RandomUtils.nextInt;

/**
 * Класс для преобразования csv-файла определённого вида с данными о рбочих в список объектов класса Employee
 */
public class EmployeeLoader {

    /**
     * метод преобразует данный csv-файл в список объектов класса Employee
     *
     * @param csvFilePath исходный csv-файл с данными о рабочих
     * @return список объектов класса Employee
     */
    public List<Employee> getEmployeeList(String csvFilePath)
    {
        List<Employee> EmployeeList = new ArrayList<>();
        int [] hash = new int[27];
        List<Integer> usedDivId = new ArrayList<>();

            try
            {
                FileReader in = new FileReader(csvFilePath);
                CSVReader reader = new CSVReader(in);
                String[] nextLine;
                while ((nextLine = reader.readNext()) != null) {
                    for (String cell : nextLine) {
                        String[] curData = cell.split(";");
                        if(curData[0].equals("id") || curData.length != 6) continue;
                        int divId = curData[4].charAt(0) - 'A';
                        while (divId == 0)
                        {
                            int candidate = nextInt();
                            if (!usedDivId.contains(candidate)) hash[divId] = candidate;
                        }
                        usedDivId.add(hash[divId]);

                        EmployeeList.addLast(new Employee(Integer.valueOf(curData[0]), curData[1], curData[2], divId, curData[4].charAt(0), Integer.valueOf(curData[5]), curData[3]));
                    }
                }
            } catch (IOException | CsvValidationException excp) {
                throw new RuntimeException(excp);
            }

        return EmployeeList;
    }
}
