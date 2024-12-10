package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {

        AbstractAnimal[] animals = {new Dog(), new Cat(), new Cow(), new Duck()};

        for (AbstractAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }


    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 움직임 테스트 시작");
        animal.move();
        System.out.println("동물 움직임 테스트 종료");
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

}
