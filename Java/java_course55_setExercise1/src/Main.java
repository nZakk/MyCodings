import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        String path = ".\\accessLog.txt";
        //Windows path

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            Set<UserLog> userLogList = new HashSet<>();

            String line = br.readLine();
            do {
                String[] fields = line.split(" ");
                String userName = fields[0];
                LocalDateTime logTime = LocalDateTime.ofInstant(Instant.parse(fields[1]), ZoneId.systemDefault() );

                userLogList.add(new UserLog(userName, logTime));

                line = br.readLine();
            } while (line != null);

            System.out.println("Total users: " + userLogList.size());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}