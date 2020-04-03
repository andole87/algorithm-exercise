import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1106 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int goal = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);

        City[] cities = new City[n];
        for (int i = 0; i < n; i++) {
            cities[i] = new City(br.readLine().split(" "));
        }
        Arrays.sort(cities);
        int result = substitute(cities, goal, 0);
        System.out.println(result);
    }

    public static int substitute(City[] cities, int amount, int index) {
        if (amount == 0) {
            return Integer.MAX_VALUE;
        }

        if (index >= cities.length) {
            return round(amount, cities[index - 1].income) * cities[index - 1].cost;
        }

        City city = cities[index];

        if (amount < city.income) {
            int substitute = substitute(cities, amount, index + 1);
            return Math.min(city.cost, substitute);
        } else {
            int count = amount / city.income;
            int cost = count * city.cost;
            if (amount % city.income == 0) {
                return cost;
            }
            int substitute = substitute(cities, amount - count * city.income, index + 1);
            if (city.cost < substitute) {
                return cost + city.cost;
            } else {
                return cost + substitute;
            }
        }
    }

    private static int round(int a, int b) {
        return (int) Math.ceil((float) a / b);
    }

    private static class City implements Comparable<City> {
        private int cost;
        private int income;

        public City(String[] input) {
            this.cost = Integer.parseInt(input[0]);
            this.income = Integer.parseInt(input[1]);
        }

        public float ratio() {
            return (float) income / cost;
        }

        @Override
        public int compareTo(City o) {
            if (o.ratio() == ratio()) {
                return cost - o.cost;
            }
            return (int) (o.ratio() - ratio());
        }
    }
}
