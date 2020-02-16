package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Arrays02 {
    @Test
    void name() {
        assertEquals(solution2(new int[]{1, 2, 1, 2, 5}), 5);
    }

    public int solution(int[] A) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            counts.put(A[i], counts.getOrDefault(A[i], 0) + 1);
        }
        return counts.entrySet().stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .findAny().get().getKey();
    }

    public int solution2(int[] A) {
        return Arrays.stream(A).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .stream()
                .filter(entry -> entry.getValue() % 2 != 0)
                .findAny()
                .get().getKey();
    }
}
