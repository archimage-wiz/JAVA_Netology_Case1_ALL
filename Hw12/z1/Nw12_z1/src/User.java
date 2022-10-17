public class User {
    private String userName;
    private String login;
    private String password;
    private String email;
    private int age;

    public User(String name, String login, String password, String email, int age) {
        this.userName = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
    
}
