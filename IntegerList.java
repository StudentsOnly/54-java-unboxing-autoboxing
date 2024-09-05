import java.util.ArrayList;
import java.util.List;

public class IntegerList {

    List<Integer> list;

    public IntegerList() {
        list = new ArrayList<Integer>();
    }

    public void add(int value) {
        list.add(value);
    }

    public Integer sum() {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public List<Integer> getList() {
        return list;
    }
}
