

public class Main {
    public static void main(String[] args) {

        User user1 = new ReaderClass("Vasya");
        User librarian1 = new LibrarianClass("Petr Perovich");
        User provider1 = new ProviderClass("Kolyan");
        User administrator1 = new AdministratorClass("Larisa Ivanovna");

        ((Reader)user1).getBook((Administrator)administrator1);
        ((Reader)provider1).getBook((Administrator)administrator1);
        System.out.println();

        ((Reader)user1).returnBook((Administrator)administrator1);
        System.out.println();

        ((Librarian)librarian1).orderBook((Provider)provider1);
        System.out.println();

        ((Administrator)administrator1).overdueNotification((Reader)user1);
        System.out.println();

        ((Reader)administrator1).getBook((Administrator)administrator1);
        ((Reader)administrator1).returnBook((Administrator)administrator1);

    }
    
}
