import java.util.Scanner;

import javax.swing.Action;


class Main {

    public static int sum(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    public void action(){
      System.out.println(Integer.MAX_VALUE
    
      +
      
      Integer.MAX_VALUE);
    }

  public static void main(String[] args) {

    int num1; int num2; int num3;

    System.out.println("Программа расчета суммы трех чисел");

    Scanner istr = new Scanner(System.in);

    System.out.println(0.1 * 2);
    System.out.println(0.1 * 3);

    action();  


    System.out.print("ВВедите Первое число: ");
    num1 = istr.nextInt();
    System.out.print("ВВедите Второе число: ");
    num2 = istr.nextInt();
    System.out.print("ВВедите Третье число: ");
    num3 = istr.nextInt();

    System.out.println("Сумма чисел = " + sum(num1, num2, num3));

    

    istr.close();

  }

}