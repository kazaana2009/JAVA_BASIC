public class EX {
    public static void main(String[] args) {

        //int test =Util.compare("a", "b");  Util 에서 Number로 지정했기때문에 String 값은 안된다.

        int result1= Util.compare(10, 20);
        System.out.println(result1);

        int result2=Util.compare(4.5, 3);
        System.out.println(result2);
    }
}
