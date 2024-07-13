

public class Main {

    public static void main(String[] args) {
        // here you can write code to test your classes
        // ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        // juice.addToWarehouse(1000.0);
        // juice.takeFromWarehouse(11.3);
        // System.out.println(juice.getName()); // Juice
        // System.out.println(juice);           // balance = 988.7, space left 11.3

        System.out.println("\n------------------");

        ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
        juice.addToWarehouse(1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.299999999999955
    

        System.out.println("\n------------------");

        ProductWarehouseWithHistory juice2 = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice2.takeFromWarehouse(11.3);
        System.out.println(juice2.getName()); // Juice
        juice2.addToWarehouse(1.0);
        System.out.println(juice2);           // Juice: balance = 989.7, space left 10.3
        
        // etc
        
        // however, history() still doesn't work properly:
        System.out.println(juice2.history()); // [1000.0]

        juice2.takeFromWarehouse(990);

        juice2.printAnalysis();

    }

}
