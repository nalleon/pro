package es.ies.puerto.combinados.file.interfaces;

import es.ies.puerto.combinados.Employee;

import java.util.List;

public interface ICrud {
    public List<Employee> obtainEmployees();
    public Employee obtainEmployee(Employee employee);

    public boolean addEmployee(Employee employee);
    public boolean removeEmployee(Employee employee);

    public boolean updateEmployee(Employee employee);

    public void saveData(List<Employee> employeeList);
}
