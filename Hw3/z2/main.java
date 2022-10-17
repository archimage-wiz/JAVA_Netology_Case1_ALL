import java.util.Scanner;


class Main {

  public static int getDays(int year){
    return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 366 : 365;
  }

  public static void main(String[] args) {
    
    Scanner input_obj = new Scanner(System.in);
    int year;
    int inp_days;
    int guess_counter = 0;

    do {
      System.out.println("Введите год в формате: yyyy количество-дней");
      year = input_obj.nextInt();
      inp_days = input_obj.nextInt();
      if (inp_days != getDays(year)){
        System.out.format("Неправильно! В этом году %s дней!\n", getDays(year));
        break;
      } else guess_counter++;
    } while (true);

    System.out.println("Набрано очко: " + guess_counter);

    input_obj.close();

  }

}