package poly.ex1;

public class AnimalPolyMain1 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animal.sound();
        dog.sound();
        cat.sound();
        cow.sound();

        System.out.println("-----------------");

        sound(animal);
        sound(dog);
        sound(cat);
        sound(cow);
    }

    private static void sound(Animal animal) {
        animal.sound();
    }

}
