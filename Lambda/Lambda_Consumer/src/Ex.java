import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class Ex {
    public static void main(String[] args) {
        //Consumer
        Consumer<String> consumer = t ->{
            System.out.println(t+"8");
        };
        consumer.accept("Java");// ㅈㅔ네릭에 String이라고 해서 String 값을 가져야한다

        //BiConsumer
        BiConsumer<String,String> biConsumer =(t,u)->{
            System.out.println(t+u);
        };
        biConsumer.accept("java", " test");

        //DoubleConsumer
        DoubleConsumer doubleConsumer = d->{
            System.out.println("Java "+d);
        };
        doubleConsumer.accept(3.14);

        //ObjIntConsumer
        ObjIntConsumer<String> objIntConsumer = (t,i)->{
            System.out.println(t+i);  //t는 java  i는 90
        };
        objIntConsumer.accept("java ", 90);

    }
}
