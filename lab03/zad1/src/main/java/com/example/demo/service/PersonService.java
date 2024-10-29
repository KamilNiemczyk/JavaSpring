package com.example.demo.service;

import com.example.demo.domain.Person;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonService {
    public Map<String, Person> loadPersonCsv(String path){
        Map<String, Person> personList = new HashMap<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(path))){
            List<String[]> rows = csvReader.readAll();
            rows.remove(0);
            for (String[] row : rows) {
                String id = row[0];
                String firstName = row[1];
                String lastName = row[2];
                String email = row[3];
                int yearOfBirth = Integer.parseInt(row[4]);

                Person person = new Person(id, firstName, lastName, email, yearOfBirth);
                personList.put(id, person);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvException e) {
            throw new RuntimeException(e);
        }
        return personList;
    }
}
