import java.util.ArrayList;
import java.util.List;

public class IntegerList {

    private static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {

        integerList.add(1);

        Integer a = 2;
        integerList.add(a);

        System.out.println(integerList);

        var c = integerList.get(0);
        System.out.println("integerList.get(0) returns " + c.getClass().getSimpleName());

        int d = integerList.get(1);
        System.out.println("d is the result of integerList.get(1) cast to int");

        var e = integerList.get(0) + integerList.get(1);
        System.out.println("The operation + returns a primitive int.");




    }

}
