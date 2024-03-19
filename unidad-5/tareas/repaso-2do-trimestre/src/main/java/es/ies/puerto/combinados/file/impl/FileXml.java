package es.ies.puerto.combinados.file.impl;

import es.ies.puerto.combinados.Employee;
import es.ies.puerto.combinados.EmployeeList;
import es.ies.puerto.combinados.file.abstracts.FileAbstracts;
import es.ies.puerto.combinados.file.interfaces.ICrud;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml extends FileAbstracts implements ICrud {
    String path = "src/main/resources/data.xml";
    List<Employee> employees;
    @Override
    public List<Employee> obtainEmployees() {
        employees = new ArrayList<>();
        Persister serializar = new Persister();
        if (existFile(path)){
            try {
                File file = new File(path);
                EmployeeList employeeList = serializar.read(EmployeeList.class, file);
                employees = employeeList.getEmployees();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return employees;
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
        if(employees.contains(employee)){
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
        EmployeeList employeeList1 = new EmployeeList(employees);
        Persister serializer = new Persister();
        try {
            serializer.write(employeeList1, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
