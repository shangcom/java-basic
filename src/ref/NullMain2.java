package ref;

public class NullMain2 {
    public static void main(String[] args) {

        Data data = null;
        data.value = 10;

        // NullPointerException. data는 null이므로, 아무런 주소도 없다.
        System.out.println("data.value = " + data.value);
    }
}
