public class CarFactory {
    public static Car getCar(CarType carType)
    {
        if (carType == CarType.HONDA)
        {
            return new HondaCar();
        }else
        {
            return new NexusCar();
        }
    }
}
