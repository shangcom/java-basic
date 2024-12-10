package poly.basic;

/*
일시적 다운 캐스팅
 */
public class CastingMain2 {
    public static void main(String[] args) {

        Parent poly = new Child();

//        poly.childMethod(); // 부모 타입 변수로 자식 클래스 메서드 호출 불가.
        ((Child) poly).childMethod(); // 메서드 호출할 때 일시적 다운 캐스팅.
    }
}
