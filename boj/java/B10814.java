import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10814 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Member[] m = new Member[n];
        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            m[i] = new Member(Integer.parseInt(s[0]), s[1], i);
        }
        Arrays.sort(m);
        StringBuilder sb = new StringBuilder();
        for (Member member : m) {
            sb.append(member.toString()).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static class Member implements Comparable<Member> {
        private int year;
        private String name;
        private int index;

        public Member(int year, String name, int index) {
            this.year = year;
            this.name = name;
            this.index = index;
        }

        @Override
        public int compareTo(Member o) {
            if (this.year == o.year) {
                return this.index - o.index;
            }
            return this.year - o.year;
        }

        @Override
        public String toString() {
            return this.year + " " + this.name;
        }
    }
}
