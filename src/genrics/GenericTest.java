package genrics;

import java.util.ArrayList;
import java.util.List;

abstract class Shapes {
    abstract void draw();
}

class Rectangle extends Shapes {
    void draw() {
        System.out.println("Drawing rectangle...");
    }
}

class Circle extends Shapes {
    void draw() {
        System.out.println("Drawing circle...");
    }
}

public class GenericTest {
    public void drawShapes(List<? extends Shapes> list) {
        for (Shapes s : list) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        GenericTest gt = new GenericTest();

        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());

        gt.drawShapes(list1);
        gt.drawShapes(list2);
    }
}
