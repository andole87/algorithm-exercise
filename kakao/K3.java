import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K3 {
    @Test
    void name() {
        Solution s = new Solution();
        String[] users = new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"};
        String[] banned = new String[]{"fr*d*", "abc1**"};
        System.out.println(s.solution(users, banned));
    }

    static class Solution {
        private List<String[]> selected = new ArrayList<>();

        public int solution(String[] user_id, String[] banned_id) {
            int answer = 0;
            permute(user_id, 0, banned_id.length);
            for (String[] strings : selected) {
                if (compare(banned_id, strings)) {
                    answer++;
                }
            }
            return answer;
        }

        public boolean compare(String[] banned_id, String[] strings) {
            String[] temp = Arrays.copyOf(banned_id, banned_id.length);
            int count = 0;
            for (String id : strings) {
                for (int i = 0; i < temp.length; i++) {
                    String key = temp[i];
                    if(key.length() != id.length()) {
                        continue;
                    }
                    for (int j = 0; j < key.length(); j++) {
                        if(key.charAt(j) == '*') {
                            continue;
                        }
                        if (key.charAt(j) != id.charAt(j)) {
                            break;
                        }
                    }
                    temp[i] = "";
                    count++;
                }
                return false;
            }
            return count == banned_id.length;
        }

        private void permute(String[] arr, int depth, int r) {
            if (depth == r) {
                selected.add(Arrays.copyOfRange(arr, 0, r));
                return;
            }
            for (int i = depth; i < arr.length; i++) {
                swap(arr, depth, i);
                permute(arr, depth + 1, r);
                swap(arr, depth, i);
            }
        }

        private void swap(String[] arr, int depth, int i) {
            String temp = arr[depth];
            arr[depth] = arr[i];
            arr[i] = temp;
        }
    }
}
