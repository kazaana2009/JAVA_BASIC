public class Util {
    public static <T extends Number> int compare(T t1,T t2){
        double v1 = t1.doubleValue();  //Number 의 자식클래스만 써야한다.
        double v2 = t2.doubleValue();  //Number 의 자식클래스만 써야한다.

        return Double.compare(v1, v2); //v1이 더크면 +1  v1 이 더크면 -1

    }
}
