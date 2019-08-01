public class Boxing_EX {
    public static void main(String[] args) {
        Box<Integer> box1= Util.<Integer>boxing(100);
        //boxing 에서 매게타입을 Integer로 줘서 나머지 T값은 Integer
        int val= box1.get();
        System.out.println(val);

        Box<String> box2= Util.boxing("홍길동");
        //만약 메게타입을 안주면 유추를한다 (String)
        String str=box2.get();
        System.out.println(str);
    }
}
