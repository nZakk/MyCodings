import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  /home/isaac/coding
        System.out.print("path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println();
        File[] files = path.listFiles(File::isFile);

        System.out.println("FILES: ");
        for(File file : files ){
            System.out.println(file);
        }

        boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println();

        System.out.println("Directory created successfully: " + success);


        File[] folders = path.listFiles(File::isDirectory);

        System.out.println();
        System.out.println("FOLDERS: ");
        for(File folder : folders ){
            System.out.println(folder);
        }
    }
}