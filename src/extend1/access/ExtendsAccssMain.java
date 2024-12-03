package extend1.access;

import extend1.access.child.Child;
import extend1.access.parent.Parent;

public class ExtendsAccssMain {
    public static void main(String[] args) {

        Child child = new Child();
        child.call();

        Parent parent = new Parent();
        System.out.println(parent.staticValue); //
    }
}
