package Ex_9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Util.execute(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
