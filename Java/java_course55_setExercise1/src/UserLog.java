import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Objects;

public class UserLog {
    private String userName;
    private LocalDateTime logTime;

    public UserLog() {
    }

    public UserLog(String userName, LocalDateTime logTime) {
        this.userName = userName;
        this.logTime = logTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getLogTime() {
        return logTime;
    }

    public void setLogTime(LocalDateTime logTime) {
        this.logTime = logTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserLog userLog = (UserLog) o;
        return Objects.equals(userName, userLog.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(userName);
    }
}
