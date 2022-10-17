import java.util.Scanner;


class Main {
    
    public static void printMenu(){
        System.out.println("Операции над double/float:");
        System.out.println("1. Сравнить.");
        System.out.println("2. Округлить.");
        System.out.println("3. Отбросить дробную часть.");
    }
    public static void main(String[] args) {
    
        Scanner input_obj = new Scanner(System.in);
        String in_line;
        double num1;
        float num2;

        do {
            printMenu();
            in_line = input_obj.nextLine();
            if (in_line.equals("end")) { break; }
            
            switch (Integer.parseInt(in_line)) {
                case 1:
                    System.out.println("Введите первое число:");
                    num1 = Double.parseDouble(input_obj.nextLine());
                    System.out.println("Введите второе число:");
                    num2 = Float.parseFloat(input_obj.nextLine());
                    long num1x = Math.round(num1 * 10000);
                    long num2x = Math.round(num2 * 10000);
                    System.out.print("Результат: ");
                    if(num1x == num2x) System.out.println("числа равны.");
                    if(num1x > num2x) System.out.println("число 1 > число 2.");
                    if(num1x < num2x) System.out.println("число 1 < число 2.");
                    break;
                case 2:
                    System.out.println("Введитe число:");
                    num1 = Double.parseDouble(input_obj.nextLine());
                    System.out.print("Результат: ");
                    System.out.println(Math.round(num1));
                    break;
                case 3:
                    System.out.println("Введитe число:");
                    num1 = Double.parseDouble(input_obj.nextLine());
                    System.out.print("Результат: ");
                    System.out.println((long) num1);
                    break;
            default:
                    break;
            }

        } while (true);
    
        input_obj.close();
    }
}
