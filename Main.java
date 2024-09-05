import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        IntegerList list = new IntegerList();

        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1 - Add an integer to the list and calculate the sum");
            System.out.println("2 - Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("Insert an integer: ");
                    int n = scanner.nextInt();

                    list.add(n);

                    Integer sum = list.sum();
                    System.out.println("Current list is: " + list.getList());
                    System.out.println("Current sum of integers in the list: " + sum);
                }
                case 2 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    running = false;
                }
                default -> System.out.println("Invalid option, please try again.");
            }
        }
    }
}
