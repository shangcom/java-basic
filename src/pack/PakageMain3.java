package pack;

/*
임포트하는 클래스의 이름이 겹치면 한쪽만 임포트 가능. 다른 한쪽은 전체 경로를 적어주어야 한다.
패키지 단위로 임포트하더라도 하위에 이름이 같은 클래스가 있을 경우 ambiguous 문제 발생.
어쨌던 이름이 같은 클래스는 동시에 임포트 안된다.
 */
import pack.a.*;
//import pack.b.User;
//import pack.b.*;
public class PakageMain3 {
    public static void main(String[] args) {

        User userA = new User();
        pack.b.User userB = new pack.b.User();

    }
}
