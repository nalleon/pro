package es.ies.puerto.combinados.file.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import es.ies.puerto.combinados.Employee;
import es.ies.puerto.combinados.file.abstracts.FileAbstracts;
import es.ies.puerto.combinados.file.interfaces.ICrud;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson extends FileAbstracts implements ICrud {
    String path = "src/main/resources/data.json";
    List<Employee> employees;

    @Override
    public List<Employee> obtainEmployees() {
        if (existFile(path)) {
            try {
                String json = new String(Files.readAllBytes(Paths.get(path)));
                Type type = new TypeToken<ArrayList<Employee>>() {
                }.getType();
                employees = new Gson().fromJson(json, type);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }

    @Override
    public Employee obtainEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            return null;
        }
        int position = employees.indexOf(employee);
        return employees.get(position);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employees.contains(employee)) {
            return false;
        }
        employees.add(employee);
        saveData(employees);
        return true;
    }

    @Override
    public boolean removeEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            return false;
        }
        employees.remove(employee);
        saveData(employees);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            return false;
        }
        int position = employees.indexOf(employee);
        employees.set(position, employee);
        saveData(employees);
        return true;
    }

    @Override
    public void saveData(List<Employee> employeeList) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(employees, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
