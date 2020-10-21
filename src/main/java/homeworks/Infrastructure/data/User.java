package homeworks.Infrastructure.data;

public class User {
    public String id;
    public String userName;
    public String userEmail;
    public String userPassword;

    public User(String s, String s1, String s2, String s3) {
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getId() {
        return id;
    }

    public String getUserPassword() {
        return userPassword;
    }
}
