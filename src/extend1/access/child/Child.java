package extend1.access.child;

import extend1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1;
        staticValue = 1;
//        defaultValue = 1; // 패키지 다르면 접근 불가
//        privateValue = 1; // 다른 클래스에서 접근 불가

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}
