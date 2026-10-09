package collections;

import java.util.*;

// PRODUCT
class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "id=" + id + " name=" + name + " price=" + price;
    }
}


// SORT BY PRODUCT ID
class SortProductById implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getId() - o2.getId();
    }
}

// SORT BY PRODUCT NAME
class SortProductByName implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

// SORT BY PRODUCT PRICE IN ASCENDING ORDER
class SortProductPriceByAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}

// SORT BY PRODUCT PRICE IN DESCENDING ORDER
class SortProductPriceByDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}


public class CollectionsTask2 {
    static ArrayList<Product> productList = new ArrayList<>();

    public void displayProduct() {
        System.out.println();
        for (Product pro : productList) {
            System.out.println(pro);
        }
    }

    static void main() {
        Scanner scan = new Scanner(System.in);

        CollectionsTask2 ct2 = new CollectionsTask2();

        SortProductById sortProductById = new SortProductById();
        SortProductByName sortProductByName = new SortProductByName();
        SortProductPriceByAscending sortProductPriceByAscending = new SortProductPriceByAscending();
        SortProductPriceByDescending sortProductPriceByDescending = new SortProductPriceByDescending();

        productList.add(new Product(101, "J", 833));
        productList.add(new Product(105, "W", 938));
        productList.add(new Product(109, "T", 232));
        productList.add(new Product(103, "S", 823));
        productList.add(new Product(108, "G", 628));
        productList.add(new Product(104, "B", 381));
        productList.add(new Product(110, "F", 923));
        productList.add(new Product(102, "E", 832));

        boolean menu = true;

        try {
            while (menu) {
                System.out.println("\n1. Add product.");
                System.out.println("2. Sorted order.");
                System.out.println("3. Search product.");
                System.out.println("4. Lowest product price.");
                System.out.println("5. Highest product price.");
                System.out.println("6. Reset the product.");
                System.out.println("7. Exit.");

                System.out.print("\nEnter your choice: ");
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("\nEnter product ID: ");
                        int id = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter product name: ");
                        String name = scan.nextLine();
                        System.out.print("Enter product price: ");
                        int price = scan.nextInt();
                        scan.nextLine();

                        productList.add(new Product(id, name, price));
                        System.out.println("Product ID: " + id + " added to the list successfully.");
                        break;
                    case 2:
                        boolean sortedMenu = true;
                        while (sortedMenu) {
                            System.out.println("\n1. Sort by ID.");
                            System.out.println("2. Sort by Name.");
                            System.out.println("3. Sort by Price.");
                            System.out.println("4. Exit.");

                            System.out.print("\nEnter your choice: ");
                            int sortedChoice = scan.nextInt();
                            scan.nextLine();

                            switch (sortedChoice) {
                                case 1:
                                    Collections.sort(productList, sortProductById);
                                    ct2.displayProduct();
                                    break;
                                case 2:
                                    Collections.sort(productList, sortProductByName);
                                    ct2.displayProduct();
                                    break;
                                case 3:
                                    boolean priceMenu = true;
                                    while (priceMenu) {
                                        System.out.println("\n1. Min --> Max.");
                                        System.out.println("2. Max --> Min.");
                                        System.out.println("3. Exit");

                                        System.out.print("\nEnter your choice: ");
                                        int priceChoice = scan.nextInt();
                                        scan.nextLine();

                                        switch (priceChoice) {
                                            case 1:
                                                Collections.sort(productList, sortProductPriceByAscending);
                                                ct2.displayProduct();
                                                break;
                                            case 2:
                                                Collections.sort(productList, sortProductPriceByDescending);
                                                ct2.displayProduct();
                                                break;
                                            default:
                                                priceMenu = false;
                                                break;
                                        }
                                    }
                                    break;
                                default:
                                    sortedMenu = false;
                                    break;
                            }
                        }
                        break;
                    case 3:
                        boolean searchMenu = true;
                        while (searchMenu) {
                            System.out.println("\n1. search by Id.");
                            System.out.println("2. search by Name.");
                            System.out.println("3. search by Price.");
                            System.out.println("4. Exit.");

                            System.out.print("\nEnter your choice: ");
                            int searchChoice = scan.nextInt();
                            scan.nextLine();

                            switch (searchChoice) {
                                case 1:
                                    System.out.print("\nEnter product ID: ");
                                    int searchId = scan.nextInt();
                                    scan.nextLine();

                                    Product searchProductId = new Product(searchId, null, 0);
//                                    Collections.sort(productList, sortProductById);
                                    int indexId = Collections.binarySearch(productList, searchProductId, sortProductById);
                                    if (indexId >= 0) {
                                        System.out.println("\nProduct found: " + productList.get(indexId));
                                    } else {
                                        System.out.println("\nProduct not found...");
                                    }
                                    break;
                                case 2:
                                    System.out.print("\nEnter product Name: ");
                                    String searchName = scan.nextLine();

                                    Product searchProductName = new Product(0, searchName, 0);
//                                    Collections.sort(productList, sortProductByName);
                                    int indexName = Collections.binarySearch(productList, searchProductName, sortProductByName);
                                    if (indexName >= 0) {
                                        System.out.println("\nProduct found: " + productList.get(indexName));
                                    } else {
                                        System.out.println("\nProduct not found...");
                                    }
                                    break;
                                case 3:
                                    System.out.print("\nEnter product Price: ");
                                    int searchPrice = scan.nextInt();
                                    scan.nextLine();

                                    Product searchProductPrice = new Product(0, null, searchPrice);
//                                    Collections.sort(productList, sortProductPriceByAscending);
                                    int indexPrice = Collections.binarySearch(productList, searchProductPrice, sortProductPriceByAscending);
                                    if (indexPrice >= 0) {
                                        System.out.println("\nProduct found: " + productList.get(indexPrice));
                                    } else {
                                        System.out.println("\nProduct not found...");
                                    }
                                    break;
                                default:
                                    searchMenu = false;
                                    break;
                            }
                        }
                        break;
                    case 4:
                        Product minPrice = Collections.min(productList, sortProductPriceByAscending);
                        System.out.println("\nLowest price product: " + minPrice);
                        break;
                    case 5:
                        Product maxPrice = Collections.max(productList, sortProductPriceByAscending);
                        System.out.println("\nHighest price product: " + maxPrice);
                        break;
                    case 6:
                        Collections.fill(productList, null);
                        break;
                    default:
                        menu = false;
                        break;
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
