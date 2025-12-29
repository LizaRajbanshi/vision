package Workshop8;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private List<User> users = new ArrayList<>();
	public User[] User;

    public boolean saveUser(User user) {
        users.add(user);
        return true;
    }

    public User findByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean updatePassword(int userId, String newPassword) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                user.setPassword(newPassword);
                return true;
            }
        }
        return false;
    }

    public boolean deleteUser(int userId) {
        return users.removeIf(user -> user.getUserId() == userId);
    }
}
