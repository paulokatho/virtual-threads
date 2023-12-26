import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) throws Exception {
        new Demo().runExecutor();
    }

    void runExecutor() throws Exception {

        for(;;) {
            long start = System.currentTimeMillis();
            try(var executor = Executors.newVirtualThreadPerTaskExecutor()) {
                for (int i=0; i < 100_000; i++) {
                    executor.submit(() -> {
                        Thread.sleep(2000);
                        return null;
                    });
                }
            }
            long end = System.currentTimeMillis();
            
            System.out.println(end - start + " ms");
        }
    }
}