package Week_2.Collections.UserRegistration;
import java.util.TreeSet;

public class UserRegistration{
    public static void main(String[] args) {
        Methods registration = new Methods();
        
        registration.registerUser("Alice");
        registration.registerUser("Bob");
        registration.registerUser("Charlie");
        
        registration.removeUser("Bob");
        
        System.out.println("Current registered users:");
        registration.displayUsers();
    }
}
class Methods {
    TreeSet<String> users= new TreeSet<>();

    public boolean registerUser(String userName) {
        return users.add(userName);
    }

    public boolean removeUser(String userName) {
        return users.remove(userName);
    }

    public void displayUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }
}

