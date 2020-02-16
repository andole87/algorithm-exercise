import java.io.*;

public class B11719 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        reader.lines()
                .forEach(str -> {
                    try {
                        writer.write(str);
                        writer.write("\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.flush();
    }
}
