public class Main{
    public static void main(String[] args) {
        Integer a = 13;
        Integer b = -15;
        Integer c = 156;
        int d = 12;
        int e = 78;
        int f = 45;

        IntegerList list = new IntegerList();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(a + d);
        list.add(c - b);
        list.add(a * d);
        list.add(e / b);
        list.add(e / f);

        list.displayObj();
        list.displayPrim();

    }

}
