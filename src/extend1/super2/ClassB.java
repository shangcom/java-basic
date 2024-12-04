package extend1.super2;

public class ClassB extends ClassA {

    // 커스텀 생성자가 존재하면 기본 생성자 자동 생성 안됨.
    public ClassB(int a) {
//        super(); // 부모 클래스의 생성자가 기본 생성자(파라미터가 없는 생성자)인 경우에는 super() 생략 가능. 여기서는 생략할 수 있음.
//        this(a, 0); // 현재 클래스의 다른 생성자를 호출. 호출된 생성자의 첫 줄에 super()가 있으면 호출한 생성자는 super() 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a = " + a + ", b = " + b);
    }
}
