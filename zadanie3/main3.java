package zadanie3;

public class Main3 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
