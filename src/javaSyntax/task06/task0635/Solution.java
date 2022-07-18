package javaSyntax.task06.task0635;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

/*
Идентификатор QR-кодов
*/

public class Solution {
    public static String[][] expectedArray = new String[3][3];
    public static String[][] actualArray = new String[3][3];

    static {
        Random random = new Random();
        for (int i = 0; i < expectedArray.length; i++) {
            for (int j = 0; j < expectedArray[0].length; j++) {
                OptionalInt optionalInt = random.ints(0, 2).findFirst();
                expectedArray[i][j] = optionalInt.isPresent() && optionalInt.getAsInt() == 1 ? " " : "#";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < actualArray.length; i++) {
            for (int j = 0; j < actualArray[i].length; j++) {
                actualArray[i][j] = scanner.nextLine();
            }
        }

        Boolean result = Arrays.deepEquals(expectedArray, actualArray);
        System.out.println(result);
    }
}
