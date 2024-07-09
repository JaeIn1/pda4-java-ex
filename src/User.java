import java.util.UUID;

public class User {
    private String name;
    private String id;
    private String pw;
    private String key;

    public User(String id, String pw, String name) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.key = UUID.randomUUID().toString();
    }

    public String getName(){
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getKey() {
        return key;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
