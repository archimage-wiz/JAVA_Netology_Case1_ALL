import java.util.Random;

class Product {
    public String name;
    public int price;
    public String description;
 
    public Product(int price, String name, String description) {
       this.name = name;
       this.price = price;
       this.description = description;
    }
 }


class Main {

   public static void mySort(Product [] arr) {
      //int [] arr = { 10, 6, 4, 5, 8, 1, 3, 9, 0, 7, 2, 5, -1};
      //System.out.println(Arrays.toString(arr));
      Product tmp;
      for (int rec_cnt = 1; rec_cnt < arr.length; ++rec_cnt) {
         for(int in_cnt = rec_cnt; in_cnt > 0; --in_cnt) {
            if (arr[in_cnt-1].price > arr[in_cnt].price) {
               tmp = arr[in_cnt-1];
               arr[in_cnt-1] = arr[in_cnt];
               arr[in_cnt] = tmp;
            } else break;
         }
      }
      //System.out.println(Arrays.toString(arr));      
   }

   public static void main(String[] args) {

      long start_time = System.currentTimeMillis();
      Product [] product_arr = new Product[250];
      Random rnd = new Random();
      String tmp_product_name = "";
      
      for (int p_cnt = 0; p_cnt < product_arr.length; ++p_cnt){
         tmp_product_name = "";
         tmp_product_name = tmp_product_name + (char) (rnd.nextInt(25)+65);
         for (int c_cnt = 0; c_cnt < rnd.nextInt(10); ++c_cnt) {
            tmp_product_name = tmp_product_name + (char) (rnd.nextInt(25)+65);
         }
         if(tmp_product_name.length() > 10) tmp_product_name = "";
         product_arr[p_cnt] = new Product(rnd.nextInt(1000)+1, tmp_product_name, "This is " + p_cnt + " item.");
      }

      product_arr[0] = new Product(50, "Product1", "This is product 1. ok");
      product_arr[1] = new Product(2, "Product2", "This is product 2.");
      product_arr[2] = new Product(140, "Product3", "This is product 3.");

      // first 100 products!!
      for (int p_cnt = 0; p_cnt < 50; ++p_cnt){
         System.out.format("%sP: %s Price: %s\n", p_cnt, product_arr[p_cnt].name, product_arr[p_cnt].price);
      }
      mySort(product_arr);
      System.out.println();
      for (int p_cnt = 0; p_cnt < 50; ++p_cnt){
         System.out.format("%sP: %s Price: %s\n", p_cnt, product_arr[p_cnt].name, product_arr[p_cnt].price);
      }

      System.out.println( (double)(System.currentTimeMillis() - start_time) / 1000.00);
   }

}