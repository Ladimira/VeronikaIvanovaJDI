package ex7.entities;

public class User {
    private String login;
    private String password;
    private String name;

    public User(String login, String password, String name) {
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
