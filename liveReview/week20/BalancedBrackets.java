package week20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
    /*
    For compiler one of the most important task is balanced brackets
    * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
    Brackets are balanced if the closing bracket matches the opening one.
    https://www.hackerrank.com/challenges/balanced-brackets/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

    Hint: Use HashMap for the bracket pairs and Stack to help keep track of which opening brackets have been seen and need to be closed

    Ex: {([])} -> balanced   ----------
    {
        (
        [ ]
        )
   }
        {[(])} -> not balanced
        {
        [ (  ')' missing  ]

        }()[] --> not balanced

        Checking for parenthesis is the most important task of a compiler

        Stack is : Last in First Out
        push(item) ---> putting an the stack at the last element position
        pop() -----> first retrives and then removes the last entry

        Map holds : key and value
        { : key  -----> } :value
        And I will use the value returned to check if the element coming from stack is opening or closing one

        Algorithm:
        Declare a Stack
        we will get String from user: iterate through the chars of String
        if the current char is an opening bracket, we will push it to Stack
        if it is closing bracket: pop the last element from Stack and compare if it is the opening one for this element
        How to match opening and closing : we will use Map key and values

        {([])}

        Stack | {  ,   ,                    |
        pop() -- [ ]  : no problem
        pop() -- ( ) : no problem
        pop() --- { }
        Map| '{'='}'

     */
    public static void main(String[] args) {

        System.out.println(" {([])} is balanced " + isBalanced("{([])}"));
    }

    public static boolean isBalanced(String exp){
        Stack<Character> stack = new Stack<>();  // hold characters coming from String

        Map<Character,Character> brackets = new HashMap<>();
        brackets.put('{','}');
        brackets.put('[',']');
        brackets.put('(',')');
     //   System.out.println("brackets = " + brackets);

        for (int i = 0; i < exp.length(); i++) {

            //    {  (  [   ]   )   }
            // stack|  |
            char ch = exp.charAt(i);
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else if(ch==')'||ch==']'||ch=='}'){
                // nothing to compare
                if(stack.isEmpty()){
                    return false;
                }else if(ch != brackets.get(stack.pop())){  // ] == ] , ) == ) , } == }
                    return false;
                }

            }
        }

        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }


    }

}
