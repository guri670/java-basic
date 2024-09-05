package day9.require;

public class SignupId {
    private static String userId;
    private static String userPassword;
    private static String userNickName;

    public SignupId(String userId, String userPassword, String userNickName) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userNickName = userNickName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }
}
