package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
//        poly.childMethod(); //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생


//      Child child = poly; // 부모타입 변수는 자식타입 변수에 넣을 수 없음
        //다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly;
        child.childMethod(); // 이제 변수 타입과 객체 타입이 모두 자식 타입으로 일치하므로 자식 타입의 메서드 사용 가능.

        /*
        문제점 : 현재는 첫줄에서 부모타입 변수 poly가 Child 객체를 참조한다는 것을 알기 쉬움.
        하지만 코드가 복잡해지고, poly만을 다른 곳에서 알 수 있는 경우, 이 참조변수가 참조하고 있는 실제 객체의 타입을 알 수 없음.
        이를 알아내기 위해 instanceof() 메서드가 제공된다.
         */
    }
}
