package Application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.BLUE, 3.0, 4.0);

        System.out.printf("Circle color : %s%n", s1.getColor());
        System.out.printf("Circle area: %.2f%n", s1.area());
        System.out.printf("Rectangle color : %s%n", s2.getColor());
        System.out.printf("Rectangle area: %.2f%n", s2.area());
    }
}
