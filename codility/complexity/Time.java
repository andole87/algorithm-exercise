package complexity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Time {
    @Test
    void name() {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
    }

    private int solution(int[] numbers) {
        int a = 0;
        int b = 0;
        int result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            a = sumOfArray(Arrays.copyOfRange(numbers, 0, i));
            b = sumOfArray(Arrays.copyOfRange(numbers, i, numbers.length));
            if (Math.abs(a - b) > result) {
                continue;
            }
            result = Math.abs(a - b);
        }
        return result;
    }

    private int sumOfArray(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
