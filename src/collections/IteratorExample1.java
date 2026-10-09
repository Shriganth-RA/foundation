package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Car {
    private int id;
    private String brand;
    private long price;

    public Car(int id, String brand, long price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return "Id=" + id + " Brand=" + brand + " Price=" + price;
    }
}

public class IteratorExample1 {
    static void main() {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(10, 20, 30, 40, 50, 60, 70));

//        Iterator<Integer> iterate = numbers.iterator();
//        while (iterate.hasNext()) {
//            System.out.println(iterate.next());
//        }

//        Iterator<Integer> listIterate = numbers.listIterator();
//        while (listIterate.hasNext()) {
//            System.out.println(listIterate.next());
//        }


        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(101, "Volvo", 45236));
        cars.add(new Car(105, "Lexus", 551184));
        cars.add(new Car(102, "Maruti", 656465));
        cars.add(new Car(103, "Benz", 65483));
        cars.add(new Car(104, "Mahindra", 2316884));

//        Iterator<Car> iterate = cars.iterator();
        ListIterator<Car> iterate = cars.listIterator();

//        while (iterate.hasNext()) {
//            iterate.next();
//        }a
//        while (iterate.hasPrevious()) {
//            System.out.println(iterate.previous());
//        }

//        while (iterate.hasNext()) {
//            if (iterate.next().getId() == 103) {
//                iterate.remove();
//            }
//            if (iterate.next().getId() == 105) {
//                iterate.add(new Car(108, "Ferrari", 3546844));
//            }
//        }
//
//        while (iterate.hasPrevious()) {
//            System.out.println(iterate.previous());
//        }

//        System.out.println(iterate.previous());

//        while (iterate.hasNext()) {
//            System.out.println(iterate.next());
//        }
    }
}
