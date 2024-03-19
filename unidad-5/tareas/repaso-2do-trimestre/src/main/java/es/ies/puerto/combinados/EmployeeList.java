package es.ies.puerto.combinados;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name ="employees" )
public class EmployeeList {

    @ElementList(inline = true)
    private List<Employee> employees;

    public EmployeeList() {
    }
    public EmployeeList(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

