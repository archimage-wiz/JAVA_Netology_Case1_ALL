import java.util.Random;
import java.util.Scanner;


class Main {

    public static final int SIZE = 10;
    public static final int EMPTY = 0;
    public static final int SHIP = 1;
    public static final int DEAD = 2;
    public static final int MISS = 3;

    public static void printField(int [][] field){
        // выводим массив на экран
        // Цикл по первой размерности выводит строки
        System.out.format(" * 12345678910\n");
        for (int i = 0; i< SIZE; i++) {
            // Цикл по второй размерности выводит колонки - вывод одной строки
            System.out.format("%2d ", (i+1));
            for (int j = 0; j< SIZE; j++) {
                if (field[i][j] == EMPTY) {
                    System.out.print("_");
                } else if (field[i][j] == SHIP) {
                    System.out.print("S");
                } else if (field[i][j] == DEAD) {
                    System.out.print("X");
                } else if (field[i][j] == MISS) {
                    System.out.print("0");
                } else System.out.println(field[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public static boolean isWin(int [][] field){
        boolean isWin = true;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == SHIP){
                    isWin = false;
                    break;
                }
            }
        }
        return isWin;
    }

    public static void main(String[] args) {

        int MAX_COUNT = 10;
        Scanner inp_obj = new Scanner(System.in);
        int warField[][]= new int[SIZE][SIZE];
        String someLine;
        int steps = 30;

        System.out.println("Игра \"Морской бой\"");
        System.out.println("Заполнение кораблей...");

        Random random = new Random();
        for (int i = 0; i< MAX_COUNT; i++) {
          int shipPlace1 = random.nextInt(SIZE);
          int shipPlace2 = random.nextInt(SIZE);
          if (warField[shipPlace1][shipPlace2] == SHIP){
            // повторная генерация положения для данного корабля
            i--;
          }
          warField[shipPlace1][shipPlace2] = SHIP;
        }
        printField(warField);

        int x; int y;
        do {
            System.out.print("Введите координаты для атаки (осталось " + steps + "):");
            someLine = inp_obj.nextLine();
            try {
                x = Integer.parseInt(someLine.split(":")[0])-1;
                y = Integer.parseInt(someLine.split(":")[1])-1;
            } catch (Exception e) {
                x = -1;  y = -1;
            }
            if (x > 10 || x < 0 || y > 10 || y < 0){
                System.out.println("Некорректный координаты");
                continue;
            } 
            if (warField[x][y] == EMPTY) {
                System.out.println("Промах!");
                warField[x][y] = MISS;
            } else if (warField[x][y] == SHIP) {
                System.out.println("Корабль застрелен!");
                warField[x][y] = DEAD;
            } else if (warField[x][y] == MISS) {
                System.out.println("Вы туда уже стреляли! Поздравляем!");
            }
            steps--;
            printField(warField);
        } while (steps > 0 && !isWin(warField));

        if(isWin(warField)){
            System.out.println("\nПоздравляем вы победитор!!!");
        } else {
            System.out.println("\nКорабли еще остались вы проиграли.");
        }
        printField(warField);
        inp_obj.close();        
    }
}
