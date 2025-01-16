package generics;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethodBox genericMethodBox = new GenericMethodBox();
        genericMethodBox.print(3);
    }
}

class GenericMethodBox {
    public <T extends Integer> void print(T t){
        System.out.println(t);
        System.out.println(t.getClass().getName());
    }
}