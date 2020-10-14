package homeworks.Generics;

public class GenericApp {

    public static void main(String[] args) {

        Box<String> box = new Box();
        box.setItem("qqq");
        Object item = box.getItem();
        Object item1 = box.getItem();
        box.setItem("string");
        box.setItem("string");
        Object item3 = box.getItem();

    }

}
