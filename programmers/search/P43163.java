package search;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class P43163 {
    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(s.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
    }

    class Solution {
        public int solution(String begin, String target, String[] words) {
            int answer = 0;
            Queue<String> q = new LinkedList<>();
            Set<String> visited = new HashSet<>();
            for (String word : words) {
                if (valid(begin, word)) {
                    q.add(word);
                    visited.add(word);
                }
            }

            int size;
            while (!q.isEmpty()) {
                size = q.size();
                for (int i = 0; i < size; i++) {
                    String curr = q.poll();
                    if (curr.equals(target)) {
                        return ++answer;
                    }
                    for (String word : words) {
                        if (!visited.contains(word) && valid(curr, word)) {
                            q.add(word);
                            visited.add(word);
                        }
                    }
                }
                answer++;
            }
            return 0;
        }

        public boolean valid(String from, String to) {
            int count = 0;
            for (int i = 0; i < from.length(); i++) {
                if (from.charAt(i) == to.charAt(i)) {
                    count++;
                }
            }
            return count == from.length() - 1;
        }
    }
}
