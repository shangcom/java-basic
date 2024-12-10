package poly.car1;

/*
Driver 클래스 : 클라이언트.
OCP(Open-Closed Principle) 원칙.
Open for extension: 새로운 기능의 추가나 변경(새로운 자동차) 사항이 생겼을 때, 기존 코드(운전자, 클라이언트)는 확장할 수 있어야 한다.
Closed for modification: 기존의 코드(운전자)는 수정되지 않아야 한다.
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
