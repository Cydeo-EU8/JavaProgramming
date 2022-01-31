package day09_IfElse_MultiBranchIf;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '@';
        String result = "";

        if(ch >= '0' && ch <= '9'){
            result = "Digit";
        }else if( (ch >= 'A' && ch <= 'Z' )  || (ch >= 'a' && ch <= 'z')  ){
            result = "Alphabetic";
        }else{
            result = "Special Character";
        }


    }

}

/*
4. Create a class called Character Identity, and write a program that can identify if
the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

 */