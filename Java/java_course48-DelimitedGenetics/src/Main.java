import service.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Product> list = new ArrayList<>();

        String path = "./products.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while (line != null){
                String[] stringMat = line.split(",");
                Product product = new Product(stringMat[0], Double.valueOf(stringMat[1]));
                list.add(product);
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive: " + x);
        }catch(IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}