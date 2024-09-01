public class Main {
    public static void main(String[] args) {
        Car hondaFactory = CarFactory.getCar(CarType.HONDA);

        System.out.println(hondaFactory.getName());

        Car nexusFactory = CarFactory.getCar(CarType.NEXUS);

        System.out.println(nexusFactory.getName());
    }
}
