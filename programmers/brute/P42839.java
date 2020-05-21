package brute;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class P42839 {

    @Test
    void name() {
        Solution s = new Solution();
        System.out.println(s.solution("011"));
    }

    private static class Solution {
        private Set<Integer> results = new HashSet<>();

        public Set<Integer> getResults() {
            return results;
        }

        public int solution(String numbers) {
            int answer = 0;
            char[] chars = numbers.toCharArray();
            for (int i = 1; i <= numbers.length(); i++) {
                perm(chars, numbers.length(), i);
            }
            for (Integer result : results) {
                if (checkPrime(result)) {
                    answer++;
                }
            }
            return answer;
        }

        public boolean checkPrime(int n) {
            if (n == 0 || n == 1) {
                return false;
            }
            if (n == 2) {
                return true;
            }
            for (int i = 2; i * 2 <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public void perm(char[] numbers, int n, int r) {
            if (n == numbers.length - r) {
                char[] res = new char[r];
                for (int i = 0; i < r; i++) {
                    res[i] = numbers[numbers.length - 1 - i];
                }
                results.add(Integer.parseInt(String.valueOf(res)));
            } else {
                for (int i = 0; i < n; i++) {
                    swap(numbers, i, n - 1);
                    perm(numbers, n - 1, r);
                    swap(numbers, i, n - 1);
                }
            }
        }

        private void swap(char[] arr, int i, int j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
