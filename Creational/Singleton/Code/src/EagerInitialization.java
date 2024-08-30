public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();
    private String name;

    private EagerInitialization(){}

    public static EagerInitialization getInstance()
    {
        return instance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String _name)
    {
        this.name = _name;
    }
}
