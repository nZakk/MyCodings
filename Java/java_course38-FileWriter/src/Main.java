import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[] {
                "oi bao", "bao dms e oce", "bao tbm"
        };

        String path = "/home/isaac/Documents/aula38-out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            // the true on the second parameter its for if you want to append the text, if its false on nothing on
            //it recreate the document
            for(String line : lines){
                bw.write(line);
                bw.newLine(); //break line
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}