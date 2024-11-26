package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 접근 가능
        data.publicField = 1;
        data.publicMethod();

        // 같은 패키지 default 접근 가능
        data.defaultField = 2;
        data.defaultMethod();

        /*
         private 접근 불가. 각각
         'privateField' has private access in 'access.a.AccessData'
         'privateMethod()' has private access in 'access.a.AccessData'
         나온다.
         */
//        data.privateField = 3;
//        data.privateMethod();

        data.inerAccess();
    }
}
