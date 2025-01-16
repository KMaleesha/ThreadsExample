package generics;

import java.util.ArrayList;

public class Example3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Amal");
        list.add("Bob");
        list.add("Carl");
        list.add("20");

        for (Object o : list) {
            String s = (String) o;
            System.out.println(s.charAt(0));
        }
    }
}
