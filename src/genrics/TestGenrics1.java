package genrics;

public class TestGenrics1 {
    public <E> void printArray(E[] obj) {
        for (E o : obj) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static void main() {
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f'};
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        TestGenrics1 tg = new TestGenrics1();

        System.out.println("Print alphabetical letters");
        tg.printArray(letters);

        System.out.println("Print numbers");
        tg.printArray(numbers);
    }
}
