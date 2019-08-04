public class Box_EX {
    public static void main(String[] args) {
        Box<String> box =new Box<String>();
        box.set("hello");
        box.get();

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        box2.get();
    }
}
