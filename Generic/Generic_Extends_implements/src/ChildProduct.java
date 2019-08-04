
//부모가 제네릭이면 자식도 제네릭 이여야한다.
public class ChildProduct<K,V,C> extends Product<K,V> {
    private C company;  //추가 제네릭 파라미터를 가진다.

    public C getCompany() {
        return company;
    }

    public void setCompany(C company) {
        this.company = company;
    }


}
