package zadanie2;

public class carExtended extends Car {
    public ExtendedCar(int numberOfSeats) {
        super(numberOfSeats);
    }

    @Override
    public void start() {
        System.out.println("Silnik samochodu się uruchamia");
    }

    @Override
    public void stop() {
        System.out.println("Silnik samochodu się wyłącza");
    }
}
