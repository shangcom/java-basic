package extend1.super2;

public class ClassC extends ClassB {

    /*
    자식 클래스
    자식 생성자의 바디 첫 줄에 부모 생성자를 반드시 써야함.
    부모 클래스인 ClassB에는 기본 생성자가 없으므로, 자식 클래스의 생성자 바디 첫 줄에 ClassB의 기본 생성자, super()이 자동으로 입력되지 않음.
    따라서 자식 클래스의 생성자 작성 시, 직접 부모 클래스의 생성자를 작성하여 호출해줘야 한다.
     */
    public ClassC() {
        super(10, 20); // 생략 불가.
        System.out.println("ClassC 생성자");
    }

    public ClassC(int a) {
        super(a);
        System.out.println("ClassC 생성자 : a = " + a);
    }

    /*
    시그니처 중복.
     */
//    public ClassC() {
//        super(10);
//    }

}
