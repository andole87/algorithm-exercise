package complexity;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermMissingElem {
    @Test
    void name() {
        assertEquals(binarySearch(new int[]{5, 1, 3, 2}), 4);
    }

    public int binarySearch(int[] numbers) {
        Arrays.sort(numbers);
        int first = 0;
        int last = numbers.length - 1;
        int center = 0;
        while (first < last) {
            if ((last - first) % 2 == 0) {
                center = (first + last) / 2;
            } else {
                center = (first + last) / 2 + 1;
            }
            if (numbers[center] > center + 1) {
                last = center - 1;
            } else {
                first = center + 1;
            }
        }
        if (numbers[last] == last + 1) {
            return numbers[last] + 1;
        }
        return numbers[last] - 1;
    }
}


