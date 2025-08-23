import java.util.Random;

public class ThreadLocalTest implements  Runnable {

    // 每个线程维护自己的key
    private static final ThreadLocal<String> localKey = ThreadLocal.withInitial(() ->  "1");


    public static void main(String[] args) throws InterruptedException {
            localKey.set(Thread.currentThread().getName());

            Thread t1 = new Thread(new ThreadLocalTest(),"threadNum" +1);

            t1.start();
            Thread t2 = new Thread(new ThreadLocalTest(), "threadNum" +2);
            t2.start();
            System.out.println(localKey.get());
            String str = new String();
        }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " before value " +  localKey.get());
        localKey.set(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName() + " after value "  + localKey.get());
        try {
            Thread.sleep(10000000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
