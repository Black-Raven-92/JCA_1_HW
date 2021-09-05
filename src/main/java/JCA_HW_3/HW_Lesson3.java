package JCA_HW_3;

import java.util.Random;
import java.util.Scanner;

public class HW_Lesson3 {
    public static void main(String[] args) {
        //ДЗ п1
        int[][] doubleArr = new int[4][4];
        int n = doubleArr.length;


        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i][i] = 1;
            doubleArr[i][n - i - 1] = 1;

        }

        for (int y1 = 0; y1 < doubleArr.length; y1++) {
            for (int x1 = 0; x1 < doubleArr[y1].length; x1++) {
                System.out.print(doubleArr[y1][x1] + "  ");
            }
            System.out.println();
        }
        //ДЗп2

        System.out.println("Добро пожаловать в игру УГАДАЙ ЧИСЛО, у вас 3 попытки");
        int randomValue = 0;
        Scanner scanner = new Scanner(System.in);
        int select;
        do {
            game(randomValue);
            System.out.println("Повторить игру? 1-да 0 - нет");
            select = scanner.nextInt();

        } while (select == 1);

    }
    public static void game(int randomValue){
        Random random=new Random();
        randomValue=random.nextInt(10);
        System.out.println(randomValue);
        System.out.println("Введите число от 0 до 9");
        int i;
        for (i =0;i<3;i++){
            Scanner scanner = new Scanner(System.in);
            int number=scanner.nextInt();
            if (number<randomValue) {
                System.out.println("Ваше число меньше загаданного");
                continue;
            }
            else if (number>randomValue){
                System.out.println("Ваше число больше загаданного");
                continue;
            }
            else if (number==randomValue){
                System.out.println("Позравляем, Вы выиграли");
                break;
            }
        }
        if (i>=3) System.out.println("Попытки закончились, Вы проиграли");
    }

}

