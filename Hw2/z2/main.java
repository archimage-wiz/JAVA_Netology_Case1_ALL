import java.util.Scanner;


class Main {

    public static final double PI = 3.14;

    public static double calculateCircleArea(int radius) {
        return PI * radius * radius;
    }

    public static double calculateCircleLength(int radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {

        int num1;
        Scanner istr = new Scanner(System.in);

        System.out.print("Введите радиус окружности в сантиметрах:");
        num1 = istr.nextInt();

        System.out.println("Площадь круга: " + calculateCircleArea(num1) +  " см.кв.");
        System.out.println("Длина окружности: " + calculateCircleLength(num1) +  " см.");

        istr.close();

    }

}