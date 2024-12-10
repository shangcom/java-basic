package poly.car0;

/*
문제점 : 운전자는 모든 종류의 자동차에 의존하고 있다.
        운전자는 모든 종류의 자동차를 알고 있어야 한다.
        자동차 종류가 늘어나면 운전자 코드를 수정해야 한다.
        모든 자동차를 필드로 작성하고, 또 그 세터 메서드를 작성해야 한다.
        drive()메서드에도 계속 자동차 종류를 추가해야 한다.
        즉, 역할과 구현이 분리되지 않았기 때문에 문제가 생긴다.
 */
public class Driver {

    private K3Car k3Car;
    private Model3Car model3Car;


    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if (model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }
}
