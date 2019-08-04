public class Ex {
    public static void main(String[] args) {
        ChildProduct<TV,String,String> product =new ChildProduct<>();
        product.setKind(new TV());
        product.setModel("스마트 TV");
        product.setCompany("삼성전자");

        Storage<TV> storage =new StorageImpl<>(100);
        storage.add(new TV(), 0);
        TV tv=storage.get(0);


    }
}
