package array.medium;

/**
 * Any live cell with fewer than two live neighbors dies, as if caused by under-population.
 * Any live cell with two or three live neighbors lives on to the next generation.
 * Any live cell with more than three live neighbors dies, as if by over-population..
 * Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
 */
public class GameofLife289 {
    /*
        1. a live cell will be live, if it has two or three live neighbors . we let them become 3,

        2. a dead cell will be live, if it has three live neighbors
     */
    public void gameOfLife(int[][] board) {
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[i].length; j++){
                int neighbours =    getNeighbour(board,i,j);
                if(board[i][j] == 1){
                    if(neighbours == 2 || neighbours == 3)
                        board[i][j] = 3;
                    }else // judge whether the dead cell can be live
                        if(neighbours == 3)
                            board[i][j]=2;

            }
        }
        for(int i = 0; i < board.length; i ++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] >>=1;
            }
        }
    }

    private int getNeighbour(int[][] board, int row, int col){
        int count = 0;
        for(int i = row -1; i <= row +1; i++){
            for(int j = col-1; j <= col +1; j++){
                if( i >=0 && i<board.length && j >=0 && j < board[i].length  )
                    count += board[i][j] &1;


            }
        }
        count -= board[row][col]&1;
        return count;
    }
}
