package es.ies.puerto.abstracts;

public abstract class Worker extends Person {
    private String jobName;
    private float salary;

    /**
     * Constructor of the class
     */
    public Worker () {}

    public Worker(String name, String dni, String birthDate, String jobName, float salary) {
        super(name, dni, birthDate);
        this.jobName = jobName;
        this.salary = salary;
    }

    /**
     * Getters and setters
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * Method toString
     */
    @Override
    public String toString() {
        return "Worker{name='" + super.getName() + '\'' +
                ", dni='" + super.getDni() + '\'' +
                ", birthDate='" + super.getBirthDate() + '\'' +
                ", jobName='" + jobName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
