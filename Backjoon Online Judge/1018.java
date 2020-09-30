package bruteforce;
import java.util.Scanner;

public class Boj1018 {
    public static int makeValidChessBoard(char[][] chess, int row, int column) {
        //흰색부터일 때 바꿔야 하는 칸 수
        int whiteChessCnt = 0;
        for(int i = row; i < row + 8; i++) {
            for(int j = column; j < column + 8; j++) {
                if((i+j)%2 == 0) { //must be W
                    if(chess[i][j] != 'W') whiteChessCnt++;
                }
                else { //must be B
                    if(chess[i][j] != 'B') whiteChessCnt++;
                }
            }
        }

        //검은색부터일 때 바꿔야 하는 칸 수 (두 개는 관계가 없나 체크해볼 수 있음. 반대여야 하니까 blackChessCnt == 64 - whiteChessCnt
        int blackChessCnt = 64 - whiteChessCnt;

        return whiteChessCnt < blackChessCnt ? whiteChessCnt : blackChessCnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // >= 8
        int M = sc.nextInt(); // >= 8
        char[][] board = new char[N][M];

        int MIN_CHANGE = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            String line = sc.next();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        for(int row=0; row <= board.length - 8; row++){
            for(int column=0; column <= board[row].length - 8; column++) {
                int change = makeValidChessBoard(board, row, column);
                MIN_CHANGE = MIN_CHANGE > change ? change: MIN_CHANGE;
            }
        }

        System.out.println(MIN_CHANGE);
    }
}
