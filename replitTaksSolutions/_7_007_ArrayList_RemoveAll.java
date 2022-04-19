//Create a static method that:
//
//        - is called `removeAll`
//        - returns `ArrayList<String>`
//        - takes two parameters: an `ArrayList` of `Strings` called `wordList`, and a `String` called `targetWord`
//
//        This method should go through every element of wordList and remove every instance of targetWord from the ArrayList.
//
//        Example:
//
//        ```
//        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
//
//        removeAll(wordList,"hi");
//
//        wordList: ["hey","yo"]
//        ```


import java.util.ArrayList;
import java.util.Scanner;

public class _7_007_ArrayList_RemoveAll {
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord)
    {


        while (wordList.contains(targetWord))
        {
            wordList.remove(targetWord);
        }

        return wordList;
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        if(size == 7)
        {
            size--;
        }

        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }
}
