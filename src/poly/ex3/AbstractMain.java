package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {

        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
        }

        System.out.println("--------------------");
        animals[0].move();
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
