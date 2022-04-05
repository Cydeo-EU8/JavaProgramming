package day35_Encapsulation.scrumTeamTask;

public class Developer {
    private String name;
    private char gender;
    private String jobTitle;
    private int id;
    private double salary;

    public static boolean isEmployed;

    static{
        isEmployed = true;
    }

    public Developer(String name, char gender, String jobTitle, int id, double salary) {
        setName(name);
        setGender(gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender = (""+gender).toUpperCase().charAt(0);
        if(!(gender == 'M' || gender == 'F') ){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary <= 0){
            System.out.println("Invalid salary: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name= '" + name + '\'' +
                ", gender= " + gender +
                ", jobTitle= '" + jobTitle + '\'' +
                ", id= " + id +
                ", salary= $" + salary +
                '}';
    }


}
