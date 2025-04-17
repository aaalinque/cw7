package zadanie1;

public class main1 {
    public static void main(String[] args) {
        Car car = new Car(5);
        car.start();
        System.out.println("Liczba miejsc: " + car.getNumberOfSeats());
        car.stop();
    }
}
