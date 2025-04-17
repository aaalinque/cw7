package zadanie2;

public class main2 {
    public static void main(String[] args) {
        ExtendedCar car = new ExtendedCar(4);
        car.start();
        System.out.println("Liczba miejsc: " + car.getNumberOfSeats());
        car.stop();
    }
}
