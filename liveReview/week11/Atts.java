package week11;

public class Atts {
/*
The class Atts holds a few attributes and has a method called asString. The attributes are name and color -both are strings and amount which is an int.Their visibility is public. asString returns a string showing all the Atts in a format.
 */
   public String name,color;  // instance variables:
   public int amount;

   public String asString(){  // instance methods
     return "name : "+name+" color : "+color+" amount : "+amount;
   }



}
