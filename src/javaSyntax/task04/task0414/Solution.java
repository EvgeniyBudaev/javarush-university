package javaSyntax.task04.task0414;

import java.util.Scanner;

/*
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        String str = scanner.nextLine();
        int number = scanner.nextInt();

        if (number <= 0 || number >= 5) {
            System.out.println(str);
        } else {
            do {
                System.out.println(str);
                x++;
            } while (x < number);
        }
    }
}
