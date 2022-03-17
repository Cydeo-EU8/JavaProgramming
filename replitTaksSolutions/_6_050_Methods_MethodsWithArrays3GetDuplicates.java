//1 **getDup** accepts an array and returns an int.
//
//        If there is any element is duplicated, the method counts how many of those present in the array.
//
//        Example :
//
//        ```
//        getDup(["1","2","aa"',"1"])
//
//        returns:2
//        ("1" is duplicated and there are two "1"s so return is 2)
//        ```
//
//        ```
//        getDup(["1","2","aa"',"1", "aa"])
//
//        returns:4
//        ("1" is duplicated and there are two "1"s
//        and 2 "aa"s so return is 4)
//        ```
//
//        ```
//        getDup(["1","g","aabb',"7","7","2","aa"',"7"])
//
//        returns:3
//        ```
//
//        hint:
//
//        - you will need a nested array the will run on the array we get from the method argument.
//        - inside the nested loop you will need to check if the main array element is equal to the current


import java.util.Scanner;

public class _6_050_Methods_MethodsWithArrays3GetDuplicates {
    public static int getDup(String[] r)
    {
        int counter=0;
        boolean counterBoolean=false;

        for(int i=0;i<r.length;i++)
        {
            for(int j=0;j<r.length;j++)
            {
                if(r[i].equals(r[j]) && !(r[i].equals("")) && i!=j)
                {
                    counterBoolean=false;
                    break;
                }
                counterBoolean=true;
            }

            if(counterBoolean==true)
            {
                r[i]="";
            }
        }

        for(int i=0;i<r.length;i++)
        {
            if(!(r[i].equals("")))
            {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }
}
