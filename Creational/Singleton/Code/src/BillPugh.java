public class BillPugh {
    private BillPugh(){}

    private static class SingletonHelper
    {
        private static final BillPugh INSTANCE = new BillPugh();
    }

    public static BillPugh getInstance()
    {
        return SingletonHelper.INSTANCE;
    }

    public void callMessage()
    {
        System.out.println("Bill Pugh");
    }
}
