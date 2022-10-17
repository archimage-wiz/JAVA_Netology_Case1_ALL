
public class User {

    public static int totalOnline = 0;
    public String name;
    public String email;
    
    public User(String name, String email){
        this.name = name;
        this.email = email;
        totalOnline++;
    }
    
}
