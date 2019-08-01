package abstract_test;

public class smartPhone extends phone{
    public smartPhone(String owner) {
        super(owner);
    }
    public void internetSearch(){
        System.out.println("인터넷 검색을합니다.");
    }
}
