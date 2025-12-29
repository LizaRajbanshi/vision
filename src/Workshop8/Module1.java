package Workshop8;

public class Module1 {
	
    private int userId;
    private String username;
    private String password;

  
    public Module1(int userId, String username, String password) {
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

   
    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
}
