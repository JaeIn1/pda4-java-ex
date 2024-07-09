import java.util.HashMap;
import java.util.Map;

public class UserDAO {
    private Map<String, User> db = new HashMap<>();

    // 사용자 정보를 저장하는 메서드
    public void save(User user) {
        db.put(user.getKey(), user);
    }

    // 사용자 정보를 가져오는 메서드
    public User getUser(String key) {
        return db.get(key);
    }

    public User getUserById(String id) {
        for (User user : db.values()) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public void updateUserInfo(String key , User user){
        db.put(user.getKey(), user);
    }

    public void deleteUser(User user){
        db.remove(user.getKey());
    }

}
