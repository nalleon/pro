package es.ies.puerto.combinados.file.impl;

import es.ies.puerto.combinados.Employee;
import es.ies.puerto.combinados.file.abstracts.FileAbstracts;
import es.ies.puerto.combinados.file.interfaces.ICrud;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends FileAbstracts implements ICrud {
    String path = "src/main/resources/data.csv";
    List<Employee> employees;

    @Override
    public List<Employee> obtainEmployees() {
        employees = new ArrayList<>();
        if(existFile(path)){
            try (BufferedReader br = new BufferedReader(new FileReader(path))){
             String str;
             while ((str = br.readLine()) != null){
                 String [] data = str.split(DELIMITER);
                 Employee employee = splitElements(data);
                 employees.add(employee);
             }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
    }

    public Employee splitElements(String [] data){
        String dni = data[0];
        String name =data[1];
        String surname = data[2];
        float salary = Float.parseFloat(data[3]);
        String occupation = data[4];

        return new Employee(dni,name,surname,salary,occupation);
    }
    @Override
    public Employee obtainEmployee(Employee employee) {
        if (!employees.contains(employee)){
            return null;
        }
        int position = employees.indexOf(employee);
        return employees.get(position);
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (employees.contains(employee)){
            return false;
        }
        employees.add(employee);
        saveData(employees);
        return true;
    }

    @Override
    public boolean removeEmployee(Employee employee) {
        if (!employees.contains(employee)){
            return false;
        }
        employees.remove(employee);
        saveData(employees);
        return true;
    }

    @Override
    public boolean updateEmployee(Employee employee) {
        if (!employees.contains(employee)){
            return false;
        }
        int position = employees.indexOf(employee);
        employees.set(position, employee);
        saveData(employees);
        return true;
    }

    @Override
    public void saveData(List<Employee> employeeList) {
        try (FileWriter writer = new FileWriter(path)){
            for (Employee employeeFile : employeeList){
                writer.write(employeeFile.toCsv()+"\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
