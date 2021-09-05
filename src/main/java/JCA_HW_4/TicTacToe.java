package JCA_HW_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final char DOT_USER = 'X';
    public static final char DOT_AI = 'O';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    public static final char DOT_EMPTY = '.';
    private static char[][] field;
    private static int winDot=0;
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAI;
    private static int roundCounter = 1;
    public static int numberWin=4;

    public static void main(String[] args) {
        play();


    }
    private static void play() {
        while (true) {
            playRound();
            System.out.printf("SCORE: HUMAN    AI\n" +
                    "         %d      %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? Y or N >>>> ");
            if (!SCANNER.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");
                break;
            }
        }

    }
    private static void playRound() {
        System.out.printf("Раунд№ %d\n", roundCounter++);
        initField(4, 4);
        printField();

        while (true) {
            UserTURN();
            printField();
            if (checkGame(DOT_USER)) break;
            AiTURN();
            printField();
            if (checkGame(DOT_AI)) break;
        }
    }
    public static void initField(int x, int y) {
        fieldSizeY = y;
        fieldSizeX = x;
        field = new char[y][x];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }


    }

    static void printField() {
        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private static void UserTURN() {
        int x, y;
        do {
            System.out.println("Введите координат Вашего хода");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = DOT_USER;


    }

    private static void AiTURN() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(y, x));
        field[y][x] = DOT_AI;

    }


    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }

    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
    }
    private static boolean checkWin(char dot) {
        int n=field.length;
//hor
        int winHor=0;
        int winVer=0;
        int winDiag=0;
        int revDiag=0;
        for(int x=0;x<fieldSizeX;x++)
        {
            for(int y=0;y<fieldSizeY;y++)
            {
                if (field[x][y]==dot)  winHor++;
                else continue;

            }
        }
        //ver
        for (int y=0;y<fieldSizeY;y++)
            for (int x=0;x<fieldSizeX;x++)
            {
               if(field[x][y]==dot) winVer++;
               else continue;

            }
        //diagonale
        for (int i=0;i<field.length;i++)
        {
            if(field[i][i]==dot) winDiag++;
            else continue;
        }
        for (int i=0;i<field.length;i++)
        {
            if(field[i][n-i-1]==dot) revDiag++;
            else continue;
        }
        if (winHor == numberWin || winVer == numberWin || winDiag == numberWin || revDiag==numberWin) {
            return true;
        } else {
            return false;
        }


    }

    private static boolean checkDraw(){
        for(int y=0;y<fieldSizeY;y++){
            for (int x=0;x<fieldSizeX;x++){
                if(isCellEmpty(y,x)) return false;
            }
        }
        System.out.println("Ничья");
        return true;
    }

    private static boolean checkGame(char dot) {
        if (checkDraw()) return true;
        if (checkWin(dot)) {
            if (dot == DOT_USER) {
                System.out.println("Вы выиграли!!!");
                scoreHuman++;
            } else {
                System.out.println("Компьютер выиграл");
                scoreAI++;
            }
            return true;
        }
        return false;
    }

}





