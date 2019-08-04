public class Ex {
    public static void main(String[] args) {

        //함수적 인터페이스
        MyFunctionalInterface fi;

        //정식 표현
        fi=(x,y)->{
            int result= x+y;
            return result;
        };
        System.out.println(fi.method(400, 123));

        //약식
        fi=(x,y) ->  x+y;
        System.out.println(fi.method(11, 423));

        //함수를 이용해서
        fi=(x,y) -> sum(x,y);
        System.out.println(fi.method(42, 44));

    }
    public static int sum(int x , int y){
        return x+y;
    }
}
