import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int qtdShapes = sc.nextInt();

        List<Shape> shapeList = new ArrayList<>();

        for(int curr = 0; curr < qtdShapes; curr++){
            System.out.printf("\033[1mShape #%d data: \033[0m%n", curr + 1);
            System.out.print("Rectangle or circle (r/c): ");
            char typeChar = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            Color color = Color.valueOf(sc.nextLine());

            if( typeChar == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);
                shapeList.add(shape);

            } else if (typeChar == 'c') {

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);
                shapeList.add(shape);
            }
        }
        System.out.println();
        System.out.printf("\033[1mSHAPE AREAS: \033[0m%n");
        for(Shape shape : shapeList){
            System.out.println(shape.area());
        }


        sc.close();
    }
}