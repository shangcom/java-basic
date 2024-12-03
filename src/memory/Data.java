package memory;

public class Data {
    private int value;

    public Data(int value) {
        System.out.println("Data 생성자");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
