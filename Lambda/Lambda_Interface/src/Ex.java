public class Ex {
    public static void main(String[] args) {
//        //runnable
//        Runnable runnable=() -> {
//          for(int i=0;i<10;i++){
//              System.out.println("i: "+i);
//          }
//        };
//
//        Thread thread = new Thread(runnable);
//        thread.run();

        Thread thread = new Thread(()->{
            for(int i=0;i<10;i++){
            System.out.println("i: "+i);
           }
        });

        thread.start();

    }
}
