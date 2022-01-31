package day09_IfElse_MultiBranchIf;

public class NumberToWord {

    public static void main(String[] args) {
        
        int n = 1;
        String result = "";
        
        if(n == 0){
            result ="zero";
        }else if(n == 1){
            result ="One";
        }else if(n == 2){
            result ="Two";
        }else if(n == 3){
            result ="Three";
        }else if(n == 4){
            result ="Four";
        }else if(n == 5){
            result ="Five";
        }else if(n == 6){
            result ="Six";
        }else if(n == 7){
            result ="Seven";
        }else if(n == 8){
            result ="Eight";
        }else{
            result ="Nine";
        }

        System.out.println(result);
        

    }

}

/*
1. Create a class called NumberToWord, and write a java program that can 
convert numbers between 0 ~ 9 to words
    Ex:
        number = 1;
        
    output:
        One
 */