package pack;

//import pack.a.User;
//import pack.a.User2;

import pack.a.*; // pack.a 패키지의 클래스를 모두 임포트한다. 단, a에 추가로 하위 패키지를 생성하면 그 패키지는 포함되지 않는다.


public class PakageMain1 {
    public static void main(String[] args) {

        // 같은 패키지에 있는 클래스는 이름으로 바로 사용 가능.
        Data data = new Data();

        // 다른 패키지에 있는 클래스는 패키지 경로 작성.
//        pack.a.User user = new pack.a.User();

        /*
         다른 패키지에 있는 클래스는 import하면 경로 없이 사용 가능.
         바로 위의 코드와 일치한다.
         */
        User user = new User();

        User2 user2 = new User2();

    }
}
