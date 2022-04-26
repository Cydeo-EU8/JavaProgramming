package week05;

public class ElementaryStudent {
    private String name;
    private int age;

    public ElementaryStudent() {
    }

    public ElementaryStudent(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    /*
    setName method should check is the name is null or empty, if it is the case then should throw an IllegalArgument exception
     */
    public void setName(String name) {
       if (name==null||name.isEmpty()){
           throw new IllegalArgumentException("Name cannot be empty or null"); // if it goes inside here then throws exception
       }
       this.name=name;
    }

    public int getAge() {
        return age;
    }
// check for ages between 5 and 12
    public void setAge(int age) {
        if(age<5||age>12){
            throw new IllegalArgumentException("Age cannot be less than 5 or greater than 12");
        }
    }

    @Override
    public String toString() {
        return "ElementaryStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
