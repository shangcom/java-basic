package extend1.access.parent;

public class Parent {

    public static int staticValue; // 얘는 모두가 공유하니까 만약 자식 인스턴스에서 수정했으면 모든 부모/자식 해당 필드 값이 변한다.

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMethod() {
        System.out.println("Parent.publicMethod");
    }
    protected void protectedMethod() {
        System.out.println("Parent.protectedMethod");
    }

    void defaultMethod() {
        System.out.println("Parent.defaultMethod");
    }

    private void privateMethod() {
        System.out.println("Parent.privateMethod");
    }

    public void printParent() {
        System.out.println("publicValue = " + publicValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("privateValue = " + privateValue);

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();
    }
}
