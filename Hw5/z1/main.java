import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    Author author1 = new Author("Mikhail", "ru");
    Author super_man = new Author("Superman", "us");

    Book bk1 = new Book("Book1", author1, 500, 2005);
    Book bk2 = new Book("Book2", author1, 150, 1865);

    Book super_book = new Book("Super Book", super_man, 500, 1625);

    super_book.setLastReadPage(23);

    System.out.println(bk1);
    System.out.println(bk2);
    System.out.println(super_book);
    System.out.println("If " + bk1.name + " == " + super_book.name + "? " + bk1.isEqual(super_book));
    System.out.format("Stop reading %s @ %s page.\n", super_book.name, super_book.getLastReadPage());

    author1.addBook(bk1);
    author1.addBook(bk2);

    System.out.println(Arrays.toString(author1.books));

    User num1 = new User("user1", "email1");
    User num2 = new User("user2", "email2");
    User num3 = new User("user3", "email3");

    System.out.format("Online: %s\n", User.totalOnline);

    System.out.println("Have a nice day!");

    
  }
}