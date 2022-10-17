import java.util.Scanner;


class Main {

  public static int getDays(int year){
    return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 366 : 365;
  }

  public static void main(String[] args) {
    
    Scanner input_obj = new Scanner(System.in);

    System.out.println("Введите год в формате \"yyyy\": ");
    int year = input_obj.nextInt();
    System.out.println("Количество дней " + getDays(year));
   
    input_obj.close();

  }

}