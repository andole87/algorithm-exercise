package level1;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class P158926 {
    @Test
    void name() {
        Solution s = new Solution();
        int[][] board = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(s.solution(board, moves));
    }

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> backet = new Stack<>();
            for (int move : moves) {
                int p = 0;
                for (int i = 0; i < board.length; i++) {
                    if (board[i][move - 1] != 0) {
                        p = board[i][move - 1];
                        board[i][move - 1] = 0;
                        break;
                    }
                }
                if (p != 0) {
                    if (!backet.isEmpty() && backet.peek() == p) {
                        backet.pop();
                        answer += 2;
                    } else {
                        backet.add(p);
                    }
                }
            }
            return answer;
        }
    }
}
