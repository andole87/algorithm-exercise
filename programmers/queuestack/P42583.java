package queuestack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P42583 {
    @Test
    void name() {
        System.out.println(Arrays.toString(sol(5, -5, 3, new int[]{-1, -3, 3})));
    }

    public int[] sol(int n, int min, int max, int[] positions) {
        int step = (max - min) / n;
        Set<Integer> sets = Arrays.stream(positions).boxed().collect(Collectors.toSet());
        int[] ints = IntStream.iterate(min, i -> i + step).limit(max + 1)
                .filter(i -> !sets.contains(i))
                .sorted()
                .toArray();
        return ints;
    }

}
