package javaSyntax.task06.task0626;

import java.util.Scanner;
import java.util.Arrays;

/*
Первая база данных
*/

public class Solution {
    public static String[][] array = new String[][]{{"123", "Иванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрей"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергей"},
            {"8", "Клочкова", "Елена"},
            {"754", "Котов", "Иван"}};

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String searchValue = scanner.nextLine();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (searchValue.equals(array[i][j])) {
                    System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                }
            }
        }
    }
}
