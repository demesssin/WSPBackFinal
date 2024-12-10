package WSPBackFinal;
import java.util.HashMap;

public class Authorization {
    private HashMap<String, String> userDatabase;
    public Authorization(){
        userDatabase = new HashMap<>();
    }

    public void register(User user){
        String existingPassword = userDatabase.get(user.getEmail());
        if (existingPassword == null){
            userDatabase.put(user.getEmail(), user.getPassword());
            System.out.println("User is successfully registered!");
        } else {
            System.out.println("User is already exists!");
        }
    }

    public boolean login(String email, String password){
        String storedPassword = userDatabase.get(email);
        if (storedPassword != null && storedPassword.equals(password)){
            System.out.println("You logged in successfully");
            return true;
        } else{
            System.out.println("Email or password is invalid, try again");
            return false;
        }
    }
}
