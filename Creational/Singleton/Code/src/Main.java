public class Main {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization1 = EagerInitialization.getInstance();

        System.out.println("Implement Singleton by Eager Initialization: ");

        eagerInitialization1.setName("Eager Initialization");
        System.out.println(eagerInitialization1.getName());

        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization2.getName());

        //Implement Singleton by Eager Initialization có nhược điểm là sẽ được khởi tạo nhưng sẽ có thể không được dùng tới.

        //Thay vào đó ta có thể sử dụng Implement Singleton by Lazy Initialization để khắc phục nhược điểm .

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

        //Nhưng Lazy Initialization lại có một nhược điểm khác khi thực hiện công việc đa luồng là ta sẽ tạo nhiều
        //hơn 1 Instance vi phạm vào nguyên tắc mỗi 1 class chỉ có 1 Instance.

        //Một phươnng pháp Implement khác Thread Safe Initialization
        System.out.println("Implement Singleton by Thread Safe Initialization: ");

        //Giải quyết vấn đề đa luồng này ta sử dụng synchronized để chỉ có 1 luồng làm việc với instance trong 1 thời điểm
        //Thread Safe
        System.out.println("Implement Singleton by Thread Safe: ");
        ThreadSafeInitialization threadSafeInitialization = ThreadSafeInitialization.getInstance();

        threadSafeInitialization.callMessage();

        //Nhưng có nhược điểm là giảm tốc độ của hệ thống vậy nên ta cần cải tiến implement này với Thread Safe Upgrade
        //Thread Safe Upgrade
        System.out.println("Implement Singleton by Thread Safe Upgrade: ");
        ThreadSafeUpgradeInitialization threadSafeUpgradeInitialization = ThreadSafeUpgradeInitialization.getInstance();

        threadSafeUpgradeInitialization.callMessage();

        //Bill Pugh là một trong những cách implement khác để chì hoãn việc khởi tạo implement khi cần thiết và sẽ ít nhược điểm hơn
        System.out.println("Implement Singleton by Bill Pugh: ");
        BillPugh billPugh = BillPugh.getInstance();

        billPugh.callMessage();

        //Và còn một số cách khác để implement singleton nữa như
        //Enum Singleton
        //Serialization and Singleton
    }
}
