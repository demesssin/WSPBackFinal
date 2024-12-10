package WSPBackFinal.User;

import WSPBackFinal.Researcher.Researcher;

public abstract class User {
    private String email;
    private String password;
    Researcher researchProfile;


    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String userEmail){
        email = userEmail;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String userPassword) {
        password = userPassword;
    }

}
