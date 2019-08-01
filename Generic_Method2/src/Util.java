public class Util {
    public static <K,V> boolean compare(Pair<K,V> p1, Pair<K,V> p2){
        //p1의 key 와 p2 의 key 의 값이 같을 경우 T  아니면 F
        boolean keyCompare =p1.getKey().equals(p2.getKey());
        //p1의 Value 와 p2 의 Value 의 값이 같을 경우 T  아니면 F
        boolean valCompare =p1.getValue().equals(p2.getValue());
        //둘다 같으면 T 아니면 F 를 리턴
        return keyCompare&&valCompare;
    }
}
