package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};

        for (String each : names) { // each: "Elminur Ablimit", "Ali Kilic", "Hulya Keles" ....

            String reversed = "";

            for (int i = each.length()-1; i>= 0; i--) { // reverses the string
                reversed += each.charAt(i);
            }

            System.out.println(reversed);

        }





    }

}
