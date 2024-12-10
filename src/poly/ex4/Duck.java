package poly.ex4;

public class Duck extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리가 움직입니다.");
    }
}
