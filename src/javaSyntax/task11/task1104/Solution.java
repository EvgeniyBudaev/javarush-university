package javaSyntax.task11.task1104;

/*
Конвертер строки
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //напишите тут ваш код
        int result = (int) Math.round(Double.parseDouble(string));
        System.out.println(result);
    }
}
