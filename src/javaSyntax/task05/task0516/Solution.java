package javaSyntax.task05.task0516;

import java.util.Arrays;

/*
Заполняем массив
*/

public class Solution {
    public static int[] array = new int[5];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //напишите тут ваш код
        int i = array.length;
        int h = (array.length / 2) + ((array.length) % 2);
        Arrays.fill(array, 0, h, valueStart);
        Arrays.fill(array, h, i, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}