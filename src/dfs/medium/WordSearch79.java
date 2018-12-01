package dfs.medium;
/*
Given a 2D board and a word, find if the word exists in the grid.

The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */
public class WordSearch79 {
    // dfs
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board[i].length; j++)
                if( exist(board, i, j, chars, 0)) return true;
        return false;
    }
    private boolean exist(char[][] board, int row, int col, char[] word, int i){
        if(i == word.length) return true;
        if(row <0 || col < 0 || row >= board.length|| col >= board[0].length|| board[row][col] != word[i]) return false;
        board[row][col] ^= 256;
        boolean ans =  exist(board, row -1, col, word, i+1) || exist(board, row +1, col, word, i+1)|| exist(board, row, col +1, word, i+1) || exist(board, row, col -1, word, i+1);
        board[row][col] ^= 256;
        return ans;
    }
}
