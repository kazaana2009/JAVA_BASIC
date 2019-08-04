public class UsingThis {
    //public int outterField =10;
    public int Field =10;


    class Inner{
        //int innerField=20;
        int Field=20;

        void method(){
            MyFunctionalInterface fi;
            fi=()->{
                //이름이 다를경우 단순이 이름만으로도 외부 클래스의 필드값을 불러올수 있다.
                //System.out.println("innerField: "+outterField);
                //System.out.println("innerField: "+innerField);

              //하지만 이름이 같은 Field 값을 호출하면 람다식이 포함한 클래스 필드를 불러온다.
              //즉 Inner(내부클래스) 의 밖(외부클래스)의 쪽으로 호출하고 싶으면 아래 문법을 적용하면된다.

                System.out.println("outterField: "+UsingThis.this.Field);
                System.out.println("innerField: "+Field);

            };
            //인터페이스가 가지고있는 Method
            fi.method();

        }
    }
}
