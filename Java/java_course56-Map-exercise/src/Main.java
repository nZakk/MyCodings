import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String path = ".\\votes.txt";

        Map<String, Integer> votes = new HashMap<String, Integer>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int qtdVotes = Integer.parseInt(fields[1]);

                if(!votes.containsKey(name)){
                    votes.put(name, qtdVotes);
                } else {
                    votes.put(name, votes.get(name) + qtdVotes);
                }
                line = br.readLine();
            }

            Set<String> keys = votes.keySet();
            for(String key : keys){
                System.out.println(key + ": " + votes.get(key));
            }
        }
        catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}