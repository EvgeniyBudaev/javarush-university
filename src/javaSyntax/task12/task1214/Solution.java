package javaSyntax.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/*
Прощай, Паскаль
*/

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python",
            "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //напишите тут ваш код
        programmingLanguages.remove("Pascal");
    }
}