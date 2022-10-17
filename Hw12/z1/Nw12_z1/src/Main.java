import java.util.Scanner;

public class Main {

    public static User[] getUsers() {
        User user1 = new User("jhon", "john1254", "111", "jhon@gmail.com", 24);
        User user2 = new User("Larisa Ivanovna", "laris1", "321", "larisa.ivanovna@gmail.com", 54);
        User user3 = new User("Vasy Pupkin", "vasyagod", "123", "vasya.god@yandex.ru", 17);
        return new User[]{user1, user2, user3};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }   

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) throw new AccessDeniedException("Too young.");
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();
        
        
        validateUser(getUserByLoginAndPassword(login, password));
        
        System.out.println("Доступ предоставлен");

        scanner.close();
        
    }
}
