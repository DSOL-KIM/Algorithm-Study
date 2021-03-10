package programers;

import java.util.Stack;

public class ClawCraneGame {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();

        for (int move: moves) {
            int j = move - 1;
            for (int i=0; i<board.length; i++) {
                if (board[i][j] > 0) {
                    int type = board[i][j];
                    if (basket.isEmpty()) {
                        basket.push(type);
                    } else {
                        if (basket.peek() == type) {
                            answer+=2;
                            basket.pop();
                        } else {
                            basket.push(type);
                        }
                    }
                    board[i][j] = 0;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {

        ClawCraneGame game = new ClawCraneGame();
        int[][] board = {
            {0,0,0,0,0},
            {0,0,1,0,3},
            {0,2,5,0,1},
            {4,2,4,4,2},
            {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};

        int result = game.solution(board, moves);

        System.out.println(result);
    }
}