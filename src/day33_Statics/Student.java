package day33_Statics;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }


}
/*
Student Task:
		1. Create a class called Student:
				Attributes:
					name, gender, age, studentID, grade

				Add a constructor that allows user to create object by setting the name of student

				Add a constructor that allows user to create object by setting the name and gender of the student

				Add a constructor that allows user to create object by setting the name and studentID of the student

				Add a constructor that allows user to create object by setting the name, studentID and grade of the student

				Add a constructor that allows user to create object by setting the name, gender and age of the student

				Add a constructor that allows user to create object by setting the name, gender, age and studentID of the student

				Add a constructor that allows user to create object by setting the name, gender, age, studentID and grade of the student

				Actions:
					toString()
					study()
 */