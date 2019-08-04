import java.util.Objects;

public class StorageImpl<T> implements Storage<T>{
    //부모가 제네릭이면 자식도 제네릭이여다.
    //만약 T 가 String 이면 String  배열을 생성한다.

    private T[] array;

    public StorageImpl(int capacity) {
        array =(T[]) (new Objects[capacity]);
    }

    @Override
    public void add(T item, int index) {
        array[index] =item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
