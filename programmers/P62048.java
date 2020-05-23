import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class P62048 {
    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(s.solution(8, 12));
    }

    static class Solution {
        public long solution(int w, int h) {
            long ww = (long) w;
            long hh = (long) h;
            BigInteger a = BigInteger.valueOf(w);
            BigInteger b = BigInteger.valueOf(h);
            long g = a.gcd(b).longValue();
            if (g == 1) {
                return ww * hh - (ww + hh - 1);
            } else {
                return ww * hh - (ww + hh - g);
            }
        }
    }
}
