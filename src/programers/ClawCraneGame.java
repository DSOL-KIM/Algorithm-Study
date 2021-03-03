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
}