import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[][] original;
    static int[][] destination;
    static int solution = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        original = new int[N][M];
        destination = new int[N][M];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < row.length(); j++) {
                original[i][j] = row.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < row.length(); j++) {
                destination[i][j] = row.charAt(j) - '0';
            }
        }

        compareArrays();
        if (!Arrays.deepEquals(original, destination)) {
            solution = -1;
        }
        System.out.println(solution);
    }

    static void compareArrays() {
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                if (original[i][j] != destination[i][j]) {
                    flip(i, j);
                }
            }
        }
    }

    static void flip(int X, int Y) {
        if (X + 2 >= original.length || Y + 2 >= original[0].length) {
            return;
        }
        for (int i = X; i < X + 3; i++) {
            for (int j = Y; j < Y + 3; j++) {
                original[i][j] ^= 1;
            }
        }
        solution++;
    }
}
