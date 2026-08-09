class Solution {
    boolean visited[][];
    public boolean exist(char[][] board, String word) {

        int rows = board.length;
        int columns = board[0].length;
        visited = new boolean[rows][columns];
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                if(word.charAt(0) == board[i][j] && searchWord(0, board, word,i, j)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchWord(int index, char[][] board, String word, int i, int j){
        if(index == word.length()){
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j]) {
            return false;
        }

        visited[i][j] = true;
        if(searchWord(index+1, board, word, i+1, j) || searchWord(index+1, board, word, i-1, j) || searchWord(index+1, board, word, i, j+1) || searchWord(index+1, board, word, i, j-1) ){
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}
