package static2;

public class DecoMain1 {
    public static void main(String[] args) {

        String s = "hello java";
        DecoUilt1 utils = new DecoUilt1();
        String decoreated = utils.deco(s);

        System.out.println("before: = " + s);
        System.out.println("after = " + decoreated);
    }
}
