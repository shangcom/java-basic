package poly.car1;

/*
운전자는 Car 인터페이스만 알고 있으면(의존하면) 된다.
다형성에 의해, Car 인터페이스를 구현하는 자동차의 인스턴스를 런타임에 결정하면 된다.
 */
public class Driver {

    private Car car;

    public void setCar(Car car) {
        System.out.println("자동차를 설정합니다: " + car);
        this.car = car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
