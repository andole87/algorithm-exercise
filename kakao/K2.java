import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class K2 {
    @Test
    void name() {
        String a = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(a)));
    }

    static class Solution {
        public int[] solution(String s) {
            String[] split = s.split("},\\{");
            split[0] = split[0].replace("{{", "");
            split[split.length - 1] = split[split.length - 1].replace("}}", "");
            int[][] numbers = new int[split.length][];
            for (int i = 0; i < split.length; i++) {
                String[] split1 = split[i].split(",");
                int[] temp = new int[split1.length];
                for (int j = 0; j < split1.length; j++) {
                    temp[j] = Integer.parseInt(split1[j]);
                }
                numbers[i] = temp;
            }
            Arrays.sort(numbers, Comparator.comparingInt(e -> e.length));
            int[] result = new int[numbers.length];
            result[0] = numbers[0][0];

            for (int i = 1; i < numbers.length; i++) {
                result[i] = sub(result, numbers[i]);
            }
            return result;
        }

        private int sub(int[] from, int[] target) {
            for (int key : target) {
                if (contains(from, key)) {
                    continue;
                }
                return key;
            }
            return 0;
        }

        private boolean contains(int[] target, int key) {
            for (int j = 0; j < target.length; j++) {
                if (key == target[j]) {
                    return true;
                }
            }
            return false;
        }
    }

}
