package queuestack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P42586 {

    @Test
    void name() {
        Solution s = new Solution();
        int[] progress = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        System.out.println(Arrays.toString(s.solution(progress, speeds)));
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            List<Integer> answer = new ArrayList<>();
            int index = 0;

            while (index < progresses.length) {
                for (int i = 0; i < progresses.length; i++) {
                    progresses[i] += speeds[i];
                }
                if (progresses[index] >= 100) {
                    boolean flag = false;
                    for (int i = 1; index + i < progresses.length; i++) {
                        if (progresses[index + i] < 100) {
                            flag = true;
                            index += i;
                            answer.add(i);
                            break;
                        }
                    }
                    if (!flag) {
                        answer.add(progresses.length - index);
                        index = progresses.length;
                    }
                }
            }

            int[] array = new int[answer.size()];
            for (int i = 0; i < answer.size(); i++) {
                array[i] = answer.get(i);
            }
            return array;
        }
    }
}
