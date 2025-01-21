package Collection;

import java.util.ArrayList;

public class ListExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }
    }
}
