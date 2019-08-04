import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Ex {
    public static void main(String[] args) {

        Pair<Integer,String> p1=new Pair<>(1,"사과");
        Pair<Integer,String> p2=new Pair<>(1,"사과");

        //비교 반드시 써넣어줘야한다 .아니면 유추하게됨.
        boolean result = Util.<Integer,String>compare(p1,p2);
        //컴파일러가 유추 할 경우
        //Util.compare(p1,p2)/



        if(result){
            System.out.println("논리적으로 동등한 객체입니다.");
        }else {
            System.out.println("논리적으로 동등하지않은 객체입니다.");
        }

        //동명이인 테스트
        Pair<String,String> p3=new Pair<>("usr1","홍길동");
        Pair<String,String> p4=new Pair<>("usr2","홍길동");

        //비교 반드시 써넣어줘야한다 .아니면 유추하게됨.
        //boolean result = Util.<String,String>compare(p3,p4);
        //컴파일러가 유추 할 경우
        boolean result2 =Util.compare(p3,p4);

        if(result2){
            System.out.println("논리적으로 동등한 객체입니다.");
        }else {
            System.out.println("논리적으로 동등하지않은 객체입니다.");
        }

    }
}
