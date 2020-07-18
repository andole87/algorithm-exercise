package hash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class P42577 {
    @Test
    void name() {
        assertFalse(solution(new String[]{"119", "97674223", "1195524421"}));
        assertFalse(solution(new String[]{"12", "123", "1235", "567", "88"}));
        assertTrue(solution(new String[]{"123", "456", "789"}));
    }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            String target = phone_book[i];
            for (int j = 0; j < phone_book.length; j++) {
                if (i == j) {
                    continue;
                }
                if (phone_book[j].startsWith(target)) {
                    return false;
                }
            }
        }
        return true;
    }
}
