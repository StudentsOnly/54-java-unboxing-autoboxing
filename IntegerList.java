import java.util.ArrayList;

public class IntegerList {
    private ArrayList<Integer> integers;

    public IntegerList(){
        integers = new ArrayList<>();
    }

    public void add(Integer i){
        integers.add(i);
    }

    public void displayObj(){
        System.out.println("\nIntegers:");
        for(Integer i:integers){
            System.out.print(i + ", ");
        }
    }
    public void displayPrim(){
        System.out.println("\nintegers:");
        for(int i:integers){
            System.out.print(i + ", ");
        }
    }
}
