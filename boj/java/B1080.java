import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1080 {
    private static boolean[][] check;
    private static int row;
    private static int column;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        row = Integer.parseInt(s[0]);
        column = Integer.parseInt(s[1]);

        boolean[][] m1 = new boolean[row][column];
        check = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < column; j++) {
                m1[i][j] = parse(line.charAt(j));
            }
        }

        for (int i = 0; i < row; i++) {
            String line = br.readLine();
            for (int j = 0; j < column; j++) {
                check[i][j] = eval(m1[i][j], line.charAt(j));
            }
        }

        int count = 0;

        for (int i = 0; i < row - 2; i++) {
            for (int j = 0; j < column - 2; j++) {
                if (!check[i][j]) {
                    reverse(i, j);
                    count++;
                }
            }
        }

        if (equals()) {
            System.out.println(count);
        } else {
            System.out.println("-1");
        }
    }

    private static boolean equals() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (!check[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void reverse(int row, int column) {
        for (int i = row; i < row + 3; i++) {
            for (int j = column; j < column + 3; j++) {
                check[i][j] = !check[i][j];
            }
        }
    }

    private static boolean parse(char input) {
        return input == '1';
    }

    private static boolean eval(boolean m1, char input) {
        return m1 == parse(input);
    }
}
