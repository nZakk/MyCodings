import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int qtdProducts = sc.nextInt();
        List<Product> productList = new ArrayList<>();

        for(int curr = 0; curr < qtdProducts; curr++){
            System.out.printf("\033[1mProduct #%d data: \033[0m%n", curr + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            sc.nextLine();
            char typeProduct = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (typeProduct == 'c'){
                Product product = new Product(name, price);
                productList.add(product);
            }else if (typeProduct == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                String dateString = sc.nextLine();

                LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                Product product = new UsedProduct(name, price, date);
                productList.add(product);

            } else if (typeProduct == 'i') {
                System.out.print("Tax fee: ");
                double taxFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, taxFee);
                productList.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");
        System.out.println();
        for(Product product : productList){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}