package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData(); // 이때 인스턴스 필드들 초기화 된다.
        System.out.println("value1 = " + data.value1);
        System.out.println("value2 = " + data.value2);
    }
}
