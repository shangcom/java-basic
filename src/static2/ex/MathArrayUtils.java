package static2.ex;

public class MathArrayUtils {
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있거나 null 입니다.");
        }
        int min = values[0];
        for (int value : values) {
            if (value <= min) {
                min = value;
            }
        }
        return min;
    }


    public static int max(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("배열이 비어 있거나 null 입니다.");
        }
        int max = values[0];
        for (int value : values) {
            if (value >= max) {
                max = value;
            }
        }
        return max;
    }
}
