package brute;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class P42841 {
    @Test
    void name() {
//        int[][] balls = new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
//        Solution s = new Solution();
//        System.out.println(s.solution(balls));
        Solution.Balls b = new Solution.Balls();
        System.out.println(b.getCount());
    }

    private static class Solution {
        public int solution(int[][] baseball) {
            Balls balls = new Balls();
            for (int[] ints : baseball) {
                balls.check(String.valueOf(ints[0]), ints[1], ints[2]);
            }
            return balls.getCount();
        }

        private static class Balls {
            private Set<String> numbers = new HashSet<>();

            public Balls() {
                for (int i = 123; i < 988; i++) {
                    numbers.add(String.valueOf(i));
                }
            }

            public void check(String hit, int strike, int ball) {
                Set<String> newNumbers = new HashSet<>();
                for (String number : numbers) {
                    Score score = checkOne(number, hit);
                    if (score.check(strike, ball)) {
                        newNumbers.add(number);
                    }
                }
                numbers = newNumbers;
            }

            private Score checkOne(String number, String hit) {
                int st = 0;
                int ba = 0;
                for (int i = 0; i < hit.length(); i++) {
                    if (number.charAt(i) == hit.charAt(i)) {
                        st++;
                    } else {
                        for (int j = 0; j < hit.length(); j++) {
                            if (number.charAt(i) == hit.charAt(j)) {
                                ba++;
                            }
                        }
                    }
                }
                return new Score(st, ba);
            }

            public int getCount() {
                return numbers.size();
            }


            class Score {
                private int strike;
                private int ball;

                public Score(int strike, int ball) {
                    this.strike = strike;
                    this.ball = ball;
                }

                public boolean check(int st, int ball) {
                    return st == strike && ball == this.ball;
                }

                @Override
                public String toString() {
                    return "Score{" +
                            "strike=" + strike +
                            ", ball=" + ball +
                            '}';
                }
            }
        }
    }
}
