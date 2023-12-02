package essths.li3.finalapplication;


import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;

    private String firstname; private String lastname;
    private String email;
    private String profileImageUrl;

    private String password;
    // Constructor
    public User() {
        // Default constructor
    }

    public User(int userId, String firstname, String email,String lastname ,String profileImageUrl,String password) {
        this.userId = userId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.profileImageUrl = profileImageUrl;
        this.password=password;

    }

    // Getters
    public int getUserId() {
        return userId;
    }

    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    // Setters
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setFirstname(String username) {
        this.firstname = username;
    }
    public void setLastname(String username) {
        this.lastname = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    public void setPassword(String password) {
        this.email = password;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }


}

