
/**
 * PARA DEMONSTRAR QUE A VIRTUAL THREAD É USADA A PARTIR O PACKAGE THREAD AINDA
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        new Demo().run();
    }

    void run() throws Exception {
        var thread = Thread.startVirtualThread(
                (() -> System.out.println("HELLO, KATHO THREAD!"))
        );
        thread.join(); //Pode executar esse cara aqui   
    }
}

