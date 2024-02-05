package es.ies.puerto.abstracts;

public abstract class Employee extends Worker{
    /**
     * Constructor of the class
     */
    public Employee (){}

    public Employee(String name, String dni, String birthDate, String jobName, float salary) {
        super(name, dni, birthDate, jobName, salary);
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Employee{name='" + super.getName() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", jobName='" + super.getJobName() + '\'' +
                ", salary=" + super.getSalary() +
                '}';
    }
}
