package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Arrays01 {
    @Test
    void name() {
        System.out.println(Arrays.toString(solution(new int[]{3, 8, 9, 7, 6}, 2)));
    }

    public int[] solution(int[] A, int K) {
        Nodes nodes = new Nodes(A);
        nodes.rotate(K);
        return nodes.status();
    }

    public class Nodes {
        private int[] numbers;
        private int currentPoint = 0;

        public Nodes(int[] numbers) {
            this.numbers = numbers;
        }

        public void rotate(int k) {
            for (int i = 0; i < k; i++) {
                rotate();
            }
        }

        public void rotate() {
            currentPoint--;
        }

        public int[] status() {
            int[] result = new int[numbers.length];
            int i = 0;
            while (i != numbers.length) {
                if (currentPoint < 0) {
                    currentPoint += numbers.length;
                    continue;
                }
                if (currentPoint >= numbers.length) {
                    currentPoint -= numbers.length;
                    continue;
                }
                result[i] = numbers[currentPoint];
                currentPoint++;
                i++;
            }
            return result;
        }
    }
}
