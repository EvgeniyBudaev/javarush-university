package javaSyntax.task06.task0623;

/*
Знакомство с двумерным массивом
*/

public class Solution {
    public static int[][] array;//напишите тут ваш код

    public static void main(String[] args) {
        //напишите тут ваш код
        array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i +1) + (j + 1);
                System.out.println(array[i][j]);
            }
        }
    }
}
