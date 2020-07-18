package queuestack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class P42585 {

    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(s.solution("()(((()())(())()))(())"));
    }

    static class Solution {
        public int solution(String arrangement) {
            int answer = 0;
            arrangement = arrangement.replace("()", " ").trim();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < arrangement.length(); i++) {
                char c = arrangement.charAt(i);
                if (c == '(') {
                    stack.add(c);
                } else {
                    if (c == ' ') {
                        answer += stack.size();
                    } else {
                        stack.pop();
                        answer++;
                    }
                }

            }
            return answer;
        }
    }
}
