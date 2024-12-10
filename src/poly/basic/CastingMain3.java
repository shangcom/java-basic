package poly.basic;

/*
업캐스팅은 생략 가능
 */
public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = (Parent) child; // 업캐스팅 생략 가능. 생략하는게 좋음.
        Parent parent2 = child; // 업캐스팅 생략 가능. 생략하는게 좋음.

        parent1.parentMethod();
        parent2.parentMethod();

        // 당연히 childMethod()는 호출 불가.
    }
}
