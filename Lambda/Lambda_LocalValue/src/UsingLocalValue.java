public class UsingLocalValue {
        //arg 는  Final 값을 가진다.
    void method(int arg){
        //arg=20;<<변경안됨

        //localValue 는 Final 값을 가진다.
        int localValue=40;
        //localValue=30;<<변경안됨

        MyFunctionalInterface fi;
        fi=()->{
            System.out.println("arg: "+arg);
            System.out.println("localval: "+localValue);
        };
        fi.method();

    }
}
