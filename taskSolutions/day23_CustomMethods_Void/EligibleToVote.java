package day23_CustomMethods_Void;

public class EligibleToVote {

    public static void eligibleToVote(int age, String citizen){

        if (age >= 18 && citizen.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }

    }


}
/*

	4. create a method that can check if a person is eligible to vote
			Ex:
				eligibleToVote(19, "USA");

			output:
				You are not eligible to vote!


 */