import org.junit.Assert;
import org.junit.Test;
import java.util.Stack;

/** 크레인 인형뽑기 게임 */
public class LvOne004 {
    /**
     * @author pm1100tm
     * @param  board,moves
     * @return int
     */
    public int mySolution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for (int move : moves) {
            for (int i = 0; i < board.length; i++) {
                
                if (board[i][move - 1] != 0) {
                    if (stack.isEmpty()) {
                        stack.push(board[i][move - 1]);
                        board[i][move - 1] = 0;
                        break;
                    }

                    if (stack.peek() != board[i][move - 1]) {
                        stack.push(board[i][move - 1]);

                    } else {
                        stack.pop();
                        answer += 2;
                    }
                    board[i][move - 1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
    
    @Test
    public void testMySolution() {
        Assert.assertEquals(4, mySolution(
                new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, 
                new int[]{1,5,3,5,1,2,1,4})
        );
        
        Assert.assertEquals(8, mySolution(
                new int[][]{{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}}, 
                new int[]{1,5,3,5,1,2,1,4})
        );
        
        Assert.assertEquals(0, mySolution(
                new int[][]{{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}}, 
                new int[]{1,5,3,5,1,2,1,4})
        );
    }
}
