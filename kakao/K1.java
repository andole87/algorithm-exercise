import org.junit.jupiter.api.Test;

import java.util.Stack;

public class K1 {
    private Stack<Integer> stack = new Stack<>();
    private int count = 0;

    @Test
    void name() {
        int[][] boards = new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = new int[]{1, 5, 3, 5, 1, 2, 1, 4};
        System.out.println(solution(boards, moves));
    }

    public int solution(int[][] board, int[] moves) {
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                int doll = board[i][move - 1];
                if (doll != 0) {
                    if (!stack.empty() && stack.peek() == doll) {
                        stack.pop();
                        count += 2;
                    } else {
                        stack.add(doll);
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        return count;
    }
}


