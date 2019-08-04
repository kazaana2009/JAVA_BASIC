package abstract_overring;

public class Dog extends Animal{
    public Dog() {
        this.kind="포유루";
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
