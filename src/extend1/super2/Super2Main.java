package extend1.super2;

/*
실행 결과

ClassA 생성자
ClassB 생성자 a = 10, b = 20
ClassC 생성자

C 생성자가 B 생성자를, B 생성자가 A 생성자를 호출.
선입후출 (FILO : First In, Last Out)
 */
public class Super2Main {
    public static void main(String[] args) {


        ClassC classC = new ClassC();

        System.out.println("--------------------------------");

        ClassC classC1 = new ClassC(100);
    }
}
