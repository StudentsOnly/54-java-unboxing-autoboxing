import java.util.ArrayList;

public class IntegerList {

    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();


        integerList.add(10);  // Autoboxing from int to Integer
        integerList.add(20);  // Autoboxing from int to Integer
        Integer wrapperInt = 30;
        integerList.add(wrapperInt);  // Direct addition of Integer object

        // display integers using both primitive and wrapper types (unboxing)
        System.out.println("List of Integers:");
        for (Integer value : integerList) {
            System.out.println("Value: " + value + " (Data type: " + ((Object)value).getClass().getSimpleName() + ")");
        }

        // mathematical operation (sum) on the integers from the list
        int sum = 0;
        for (int value : integerList) {  // Unboxing from Integer to int
            sum += value;
        }
        System.out.println("Sum of all integers: " + sum);
    }
}
