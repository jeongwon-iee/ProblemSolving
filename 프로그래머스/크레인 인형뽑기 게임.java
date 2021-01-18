import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] top = new int[board.length];
        Stack<Integer> cart = new Stack<>();
        
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                if(board[j][i] != 0) {
                    top[i] = j;
                    break;
                }
            }
        }
        
        for(int i=0; i<moves.length; i++) {
            int move = moves[i]-1;
            if(top[move] >= board.length) continue;
            int doll = board[top[move]][move];
            top[move]++;
            if(!cart.isEmpty() && cart.peek() == doll) {
                cart.pop();
                answer+=2;
            }
            else cart.push(doll);
        }
        return answer;
    }
}
