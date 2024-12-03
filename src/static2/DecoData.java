package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //instanceValue++; //인스턴스 변수 접근, compile error. 인스턴스 존재 유무, 어떤 인스턴스인지 알 수 없음.
        //instanceMethod(); //인스턴스 메서드 접근, compile error

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메서드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }


    public static void statiCallWithVariable(DecoData decoData) {
        decoData.instanceValue++; // 인스턴스 주소로 접근 가능.
        decoData.instanceMethod();

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    // 바디에서 인스턴스 새로 만들어서 지역변수로 사용하면 가능. 근데 맥락이 좀 다름.
    public static void staticCallLocalInstance() {
        DecoData decoData = new DecoData();
        decoData.instanceValue++;
        decoData.instanceMethod();

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

}
