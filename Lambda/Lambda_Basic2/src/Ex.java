public class Ex {
    public static void main(String[] args) {

        //함수적 인터페이스
        MyFunctionalInterface fi;

        //정식표현
        fi = (x) -> {
          int result =x*5;
            System.out.println(result);
        };
        fi.method(100);

        //약식표현
        fi = x -> System.out.println(x*550);
        fi.method(14324);

    }
}
