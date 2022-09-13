package Part6;

public class Main6 {
    private String login;
    private String password;

    public void CredentialException(String login, String password) {
        this.login = login;
        this.password =password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Credentials{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
