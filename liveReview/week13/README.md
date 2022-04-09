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
4. conditions in setter method, we usually customize getter method output format, return the data in a certain format

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

Let's make our class read-only
--- immutable
````
##Inheritance
1. A class inherit the properties/methods of parent class
2. we use extends keyword for it
3. Builds a **'IS A'** relationship

### What can be inherited?
- All public variables, methods
- All protected var. and met.
- All default var. and mets. only if super and sub class are in the same package
### What can Not be inherited?
- private variables and methods, however you can reach these with public getter/setters
- constructors: sub class first calls super class constructor

````
We will create a Book parent class
title,type,author,price
- child classes: AudioBook, PaperBook, EBook

````
**In real life application we will mostly use 'protected' access modifier for inheritance** 

### Benefits:
1. Encapsulation: protect instance variables from invalid values
2. Inheritance: it provides code reusability and maintainability
3. maintainability: we put common fields and methods to parent class (one place)
   (Page Object models: we will have a parent class)
   
### Constructors:
1. superclass constructor always execute before the subclass constructor
2. this() also needs to be the first statement, super() and this() can NOT be in the same constructor