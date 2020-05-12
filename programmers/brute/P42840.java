package brute;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class P42840 {

    @Test
    void name() {
        Solution s = new Solution();
        int[] answers = new int[]{1, 3, 2, 4, 2};
        System.out.println(Arrays.toString(s.solution(answers)));
//        Student3 s3 = new Student3();
//        System.out.println(s3.getAnswer());
//        System.out.println(s3.getAnswer());
//        System.out.println(s3.getAnswer());
//        System.out.println(s3.getAnswer());
//        System.out.println(s3.getAnswer());
//        System.out.println(s3.getAnswer());
//        System.out.println(s3.getAnswer());
    }

    private static class Solution {
        public int[] solution(int[] answers) {
            int[] answer;
            List<Score> scores = Arrays.asList(new Score(1), new Score(2), new Score(3));
            Student1 s1 = new Student1();
            Student2 s2 = new Student2();
            Student3 s3 = new Student3();

            for (int ans : answers) {
                int a = s1.getAnswer();
                int b = s2.getAnswer();
                int c = s3.getAnswer();

                if (ans == a) {
                    scores.get(0).add();
                }
                if (ans == b) {
                    scores.get(1).add();
                }
                if (ans == c) {
                    scores.get(2).add();
                }
            }
            scores.sort((a, b) -> b.getScore() - a.getScore());
            if (scores.get(0).getScore() == scores.get(1).getScore()) {
                if (scores.get(1).getScore() == scores.get(2).getScore()) {
                    answer = new int[]{1, 2, 3};
                } else {
                    answer = new int[]{scores.get(0).getIndex(), scores.get(1).getIndex()};
                }
            } else {
                answer = new int[]{scores.get(0).getIndex()};
            }
            return answer;
        }

        public static class Student1 {
            private int prev;

            public Student1() {
                prev = 1;
            }

            public int getAnswer() {
                if (prev == 5) {
                    prev = 1;
                    return 5;
                } else {
                    return prev++;
                }
            }
        }

        private static class Student2 {
            private int[] ORDER = {1, 3, 4, 5};
            private int index;
            private boolean two;

            public Student2() {
                index = 0;
                two = true;
            }

            public int getAnswer() {
                if (two) {
                    two = false;
                    return 2;
                } else {
                    two = true;
                    if (index == 3) {
                        index = 0;
                        return ORDER[3];
                    }
                    return ORDER[index++];
                }
            }
        }

        private static class Student3 {
            private final int[] ORDER = {3, 1, 2, 4, 5};
            private int count;
            private int index;

            public Student3() {
                count = 0;
                index = 0;
            }

            public int getAnswer() {
                count++;
                if (count != 1 && count % 2 == 1) {
                    if (index == 4) {
                        index = 0;
                        return ORDER[index];
                    } else {
                        return ORDER[++index];
                    }
                } else {
                    return ORDER[index];
                }
            }
        }

        private static class Score {
            private int index;
            private int score;

            public Score(int index) {
                this.index = index;
                score = 0;
            }

            public void add() {
                score++;
            }

            public int getIndex() {
                return index;
            }

            public int getScore() {
                return score;
            }
        }
    }
}
