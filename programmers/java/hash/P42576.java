package hash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P42576 {
    @Test
    void name() {
        assertEquals("leo", solution(new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}));
        assertEquals("mislav", solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}));
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Long> player = makeMap(participant);
        Map<String, Long> complete = makeMap(completion);

        for (String s : complete.keySet()) {
            long aLong = player.get(s);
            if (complete.get(s) == aLong) {
                player.remove(s);
            } else {
                return s;
            }
        }
        return player.keySet().iterator().next();
    }

    private Map<String, Long> makeMap(String[] input) {
        return Arrays.stream(input)
                .collect(Collectors.groupingBy(x -> x,
                        HashMap::new,
                        Collectors.counting()));
    }
}
