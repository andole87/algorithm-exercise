import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class B2164 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        while (q.size() != 1) {
            q.pollFirst();
            q.addLast(q.pollFirst());
        }
        System.out.println(q.poll());
    }

    @Test
    void name() {
        System.out.println(Integer.toBinaryString(10));
    }
}
