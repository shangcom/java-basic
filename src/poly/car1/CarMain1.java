package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {

        // 차랑 선택 : k3
        Driver driver = new Driver();
        driver.setCar(new K3Car());
        driver.drive();

        // 차량 변경 : Model3
        driver.setCar(new Model3Car());
        driver.drive();

        // 차량 변경 : NewCar
        driver.setCar(new NewCar());
        driver.drive();
    }
}
