import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {
    @Test
    void name() {
        assertEquals(321, reverse(123));
        assertEquals(-321, reverse(-123));
        assertEquals(21, reverse(120));
        assertEquals(0, reverse(0));
    }

    int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}