package search;

import org.junit.jupiter.api.Test;

import java.util.*;

public class P43164 {

    @Test
    void name() {
//        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
//        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[][] tickets = {{"ICN", "A"}, {"ICN", "B"}, {"B", "ICN"}};
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(tickets)));
    }

    class Solution {

        private List<String> answer;
        private Map<String, List<String>> adj;
        private int size, step, total;

        public String[] solution(String[][] tickets) {
            answer = new ArrayList<>();
            total = tickets.length;
            adj = new HashMap<>();
            for (String[] ticket : tickets) {
                String from = ticket[0];
                String to = ticket[1];
                if (!adj.containsKey(from)) {
                    adj.put(from, new ArrayList<>());
                }
                adj.get(from).add(to);
            }
            for (List<String> value : adj.values()) {
                Collections.sort(value);
            }

            answer.add("ICN");
            return answer.toArray(new String[0]);
        }
    }
}
