import java.util.function.IntSupplier;

public class Ex {
    public static void main(String[] args) {
        IntSupplier intSupplier = ()->{   //매개변수가 없기때문에 ()로 작성한다.
            int num =(int)(Math.random()*6)+1;
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("눈의수 ="+num);
    }

}
