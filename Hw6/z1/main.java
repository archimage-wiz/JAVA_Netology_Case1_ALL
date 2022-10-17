import java.util.Scanner;


class Main {

    static final int tax = 6;

    public static void printMenu(String [] products, int [] prices){
        System.out.println("Список возможных товаров для покупки:");
        for (int p_cnt = 0; p_cnt < products.length; p_cnt++) {
            System.out.format("%s. %s %s руб/шт.\n", p_cnt+1, products[p_cnt], prices[p_cnt]);
        }
    }
  
  public static void main(String[] args) {
    
    String[] products = {"Молоко", "Хлеб", "Гречневая крупа"};
    int[] prices = { 50, 14, 80 };
    int[] result = new int[3];
        
    Scanner input_obj = new Scanner(System.in);
    String in_line;
    int earnings = 0;    // доходы
    int spendings = 0;   // расходы

    do {
        printMenu(products, prices);
        System.out.println("Выберите товар и количество или введите `end`");
        in_line = input_obj.nextLine();
        if (in_line.equals("end")) { break; }
        int prod_num = Integer.parseInt(in_line.split(" ")[0]) - 1;
        int ammount = Integer.parseInt(in_line.split(" ")[1]);
        result[prod_num] = result[prod_num] + ammount;
    } while (true);

    int total_sum = 0;
    System.out.println("\nВаша корзина(.руб):\n");
    //System.out.println("   ");
    for (int p_cnt = 0; p_cnt < result.length; ++p_cnt){
        if (result[p_cnt] > 0){
            int this_product_sum = result[p_cnt] * prices[p_cnt];
            total_sum += this_product_sum;
            System.out.format("Наименование товара: %s\nКоличество: %s\nЦена/за.ед: %s\nОбщая стоимость: %s\n\n", products[p_cnt], result[p_cnt], prices[p_cnt], this_product_sum);
        }
    }
    System.out.println("Итого: " + total_sum + " руб.\n");

   
    input_obj.close();

  }

}