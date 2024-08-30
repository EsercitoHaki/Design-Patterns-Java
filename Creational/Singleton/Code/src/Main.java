public class Main {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();

        System.out.println("Implement Singleton by Eager Initialization: ");

        eagerInitialization1.setName("Eager Initialization");
        System.out.println(eagerInitialization1.getName());

        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization2.getName());

        System.out.println("Implement Singleton by Lazy Initialization: ");
        //TH1: Khi chạy đơn luồng
        LazyInitialization lazyInitialization = LazyInitialization.getInstance();

        lazyInitialization.showMessage();

        //TH2: Khi chạy đa luồng
        Thread thread1 = new Thread(() -> {
            LazyInitialization lazyInitialization1 = LazyInitialization.getInstance();

            lazyInitialization1.showMessage();
        });

        Thread thread2 = new Thread(() -> {
            LazyInitialization lazyInitialization2 = LazyInitialization.getInstance();

            lazyInitialization2.showMessage();
        });

        thread1.start();
        thread2.start();
    }
}
