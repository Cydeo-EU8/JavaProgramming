package day36_Inheritance.employeeTask;

public class Employee {

    public String name;
    public char gender;
    public int age, id;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(jobTitle +" "+name+" is working");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +  // this gets the class name automatically
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


}

/*
2.1 Create a class named Employee:
			variables:
				name, gender, age, id, jobTitle, salary

			Methods:
				setInfo()
				work()
				toString()

 */