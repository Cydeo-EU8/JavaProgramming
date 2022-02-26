package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'A', 'A', 'B', 'C', 'C', 'D', 'D', 'D'};

        for (int j = 0; j < chars.length; j++) {
            char ch = chars[j]; //'A'
            int frequency = 0;
            for (int i = 0; i < chars.length; i++) {
                if(chars[i] ==ch){
                    frequency++;
                }
            }

            if(frequency == 2){
                System.out.println(ch);
            }

        }





    }

}
