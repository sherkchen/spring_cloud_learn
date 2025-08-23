import java.lang.ref.*;

public class DemoTest {

    private Integer num;

    public DemoTest(int num) {
        this.num= num;
    }
    public static void main(String[] args) {
        DemoTest counter = new DemoTest(1);
        DemoTest  counter2 = new DemoTest(2);
        DemoTest  counter3 = new DemoTest(3);
        // 创建引用队列
        ReferenceQueue refQueue = new ReferenceQueue<>();
        // 将队列和应用关联
        // PhantomReference 幻象引用，
        // Creates a new phantom reference that refers to the given object and is registered with the given queue.
        PhantomReference<Object> p = new PhantomReference<>(counter, refQueue);
        // 软引用
        SoftReference<Object> softReference = new SoftReference<>(counter2);
        // 虚引用
        WeakReference<Object> weakReference = new WeakReference<>(counter3);
        ThreadLocal<Integer> local = new ThreadLocal<>();
        local.set(5);

        ThreadLocal<Integer> local1 = new ThreadLocal<>();
        local1.set(6);

        // key
        ThreadLocal<Integer> local2 = new ThreadLocal<>();
        local2.set(9);


        try {
            counter = null;
            counter2 = null;
            local2 = null;
            System.gc();
            Thread.sleep(2000);
            // Remove是一个阻塞方法，可以指定timeout，或者选择一直阻塞
            Reference<Object> ref = refQueue.remove(1000L);
            if (ref != null) {
                // do something
                System.out.println("ref queue remove");
            }
        } catch (InterruptedException e) {
            System.out.println("occur InterruptedException");
        }
    }



}
