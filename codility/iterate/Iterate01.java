package iterate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Iterate01 {
    @Test
    void name() {
        System.out.println(solution(32));
        System.out.println(solution2(529));
    }

    public int solution(int N) {
        String number = Integer.toBinaryString(N);
        List<Integer> integers = new ArrayList<>();
        int gap = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1') {
                integers.add(gap);
                gap = 0;
            } else {
                gap++;
            }
        }
        return Collections.max(integers);
    }

    public int solution2(int n) {
        int result = 0;

        int i = 0;
        while (n != 0) {
            result += (n % 2) * Math.pow(10, i++);
            n = n / 2;
        }
        return result;
    }
}
