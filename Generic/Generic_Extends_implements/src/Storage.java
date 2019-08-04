public interface Storage<T> {
    //객체의 아이탬을 몇번째 인덱스에 넣겠다
    public void add(T item,int index);
    //몇번째의 인덱스를 입력하면 해당되는 객채를 가져온다.
    public T get(int index);
}
