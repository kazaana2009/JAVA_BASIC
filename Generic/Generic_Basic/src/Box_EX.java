public class Box_EX {
    public static void main(String[] args) {
        Box<String> box =new Box<String>();
        box.set("hello");
        System.out.println("box : "+ box.get());
        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        System.out.println("box2 : "+ box2.get());
    }
}
