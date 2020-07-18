package search;

import org.junit.jupiter.api.Test;

public class P43165 {
    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1, 1, 1, 1, 1}, 3));

    }

    static class Solution {
        public int solution(int[] numbers, int target) {
            return dfs(numbers, 0, target);
        }

        private int dfs(int[] numbers, int index, int target) {
            if (index == numbers.length) {
                if (target == 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
            return dfs(numbers, index + 1, target - numbers[index]) + dfs(numbers, index + 1, target + numbers[index]);
        }
    }
}
