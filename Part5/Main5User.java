package Part5;

public class Main5User<Credentials> {
    private String name;
    private int age;
    private transient Credentials credentials;

    public void User(String name, int age, Credentials credentials) {
        this.name = name;
        this.age = age;
        this.credentials = credentials;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public Credentials getCredentials() {
        return credentials;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
