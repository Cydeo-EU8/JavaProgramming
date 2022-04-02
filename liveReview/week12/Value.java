package week12;

public class Value {
    /*
    Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called, it getVal returns the last value passed to setVal. Otherwise if the "single int parameter" constructor was used to create the object, getVal returns the value passed to that constructor. Otherwise getVal returns 0.
     */

    int param; // you can omit initialzing to zero
    boolean calledMethod = false;
    boolean calledConstructor=false;
    public Value(){} // no parameter
    public Value(int param){ // single parameter
        this.param=param;
        calledConstructor=true;
    }
    public void setValue(int param){ // one parameter method and is void
        this.param=param;
        calledMethod =  true;
    }
    public boolean wasModified(){
       return calledMethod;
    }

    public int getValue(){
       /*
       below code becomes redundant because it is going to return instance variable in all conditions
       if(this.calledMethod){
            return this.param;
        }
        else if(calledConstructor)
            return this.param;
        else{
            return this.param;
        }
        */
        return this.param;
    }


}
