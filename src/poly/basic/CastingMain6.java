package poly.basic;

/*
instanceof 사용과 동시에 선언 (패턴 매칭)
 */
public class CastingMain6 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    /*
    실제 객체가 Child면 childMethod() 호출해라.
     */
    private static void call(Parent parent) {
        parent.parentMethod();
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child = (Child) parent;
            child.childMethod();
        }
    }

}
