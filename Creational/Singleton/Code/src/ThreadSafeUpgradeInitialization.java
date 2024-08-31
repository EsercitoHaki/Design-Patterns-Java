public class ThreadSafeUpgradeInitialization {
    private static ThreadSafeUpgradeInitialization instance;

    private ThreadSafeUpgradeInitialization(){}

    public static ThreadSafeUpgradeInitialization getInstance()
    {
        if (instance == null)
        {
            synchronized (ThreadSafeInitialization.class)
            {
                if (instance == null)
                {
                    instance = new ThreadSafeUpgradeInitialization();
                }
            }
        }
        return instance;
    }

    public void callMessage()
    {
        System.out.println("Thread Safe Upgrade");
    }
}
