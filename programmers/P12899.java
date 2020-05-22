import org.junit.jupiter.api.Test;

public class P12899 {
    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(s.solution(10));
    }

    static class Solution {
        public String solution(int n) {
            StringBuilder answer = new StringBuilder();
            int rmd;

            while (n > 0) {
                rmd = n % 3;
                n = n / 3;

                if (rmd == 0) {
                    n -= 1;
                    rmd = 4;
                }

                answer.insert(0, rmd);
            }

            return answer.toString();
        }
    }
}
