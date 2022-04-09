#JAVA OOP Concepts
##Encapsulation
###What is Encapsulation?
1. Data Hiding
    - Hiding the data by providing private access modifiers
2. How do we perform? (**PIQ**)
   - make all class fields private
   - create public getter: to read the data 
    - create public setter: to write the data
 3. Encapsulation helps us to manipulate the data field with certain conditions(we will apply this concept with Singleton Driver Class Design)   

###Read Only
   - Only provide getter to your class, and it will be Read-Only (immutable: not changing)
###Write Only
   - We can provide only setter to our class to make it write only

```
In Db class we have two attributes/instance variables with the private visibility. meaning they cannot be accessed outside of the class.

Instance variables:
1) name: data -
type: String
Visibility/Access modifier: private
2) name: yint -
type: int
Visibility/Access modifier: private

Methods:
- insertData - lets you set the values to above encapsulated instance variables.
- getData - getter method for private data
- getYint - getter method for private yint
- setData - setter method for private data
- setYint - setter method for private yint



for example

Db db = new Db();
db.insertData("aaa",123);

System.out.println(db.getData());//aaa
System.out.println(db.getYint());//123

db.setData("zzz");
db.setYint(200);

System.out.println(db.getData());//zzz
System.out.println(db.getYint());//200
```
````
Person class has following attributes:

- private String instance variables: firstName, lastName
- private int instance variable: age

Methods:
- getter and setter methods for each instance variable. try to use this. keyword
- toString method.No parameters and Returns(does not print! no println in the method!) person info in this format: "firstName | lastName | age"

Constructors:

1) No-Args constructor
   -sets default values for the Person object
   name and lastName => "undefined"
   age => -1

2) 3-Args Constructor:
- accepts firstName, lastName, age parameters and assigns values to encapsulated instance variable
  try to use this. keyword

Examples:

Person person = new Person();

System.out.println(person.getFirstName()); //"undefined"
System.out.println(person.getLastName()); //"undefined"
System.out.println(person.getAge()); // -1
System.out.println(person.toString()); //"undefined | undefined | -1"

person.setFirstName("John");
person.setLastName("Doe");
person.setAge(44);

System.out.println(person.toString() ); // "John | Doe | 44"

Person person = new Person("Fatima", "Lee", 22);

System.out.println(person.getFirstName()); //"Fatima"
System.out.println(person.getLastName()); //"Lee"
System.out.println(person.getAge()); // 22
System.out.println(person.toString()); //"Fatima | Lee | 22"
