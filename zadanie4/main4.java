package zadanie4;

public class Main4 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Lion(),
                new Cat(),
                new Wolf(),
                new Dog()
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.roam();
        }
    }
}
