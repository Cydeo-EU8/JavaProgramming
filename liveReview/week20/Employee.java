package week20;

public class Employee {

    private String first_name;
    private String last_name;
    private String job_ID;
    private double salary;
    private int department_ID;

    public Employee() {
    }

    public void setInfo(String first_name, String last_name, String job_ID, double salary, int department_ID) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.job_ID = job_ID;
        this.salary = salary;
        this.department_ID = department_ID;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getJob_ID() {
        return job_ID;
    }

    public void setJob_ID(String job_ID) {
        this.job_ID = job_ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment_ID() {
        return department_ID;
    }

    public void setDepartment_ID(int department_ID) {
        this.department_ID = department_ID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", job_ID='" + job_ID + '\'' +
                ", salary=" + salary +
                ", department_ID=" + department_ID +
                '}';
    }
}
