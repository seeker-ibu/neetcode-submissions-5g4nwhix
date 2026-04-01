class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int row =0 ; row<9;row++){
            Set<Character> need = new HashSet<>();
            for(int col=0;col < 9;col++){
                if(board[row][col]== '.')continue;
                if(need.contains(board[row][col])){
                    return false;
                }
                need.add(board[row][col]);
            }
        }

        for(int col =0 ; col<9;col++){
            Set<Character> need = new HashSet<>();
            for(int row=0;row < 9;row++){
                if(board[row][col]== '.')continue;
                if(need.contains(board[row][col])){
                    return false;
                }
                need.add(board[row][col]);

            }
        }

        for(int sqr = 0;sqr < 9 ; sqr ++){
            Set<Character> need = new HashSet<>();
            for(int row = 0 ; row < 3 ; row ++){
                for(int col = 0; col < 3 ; col ++){
                    int rowV = (sqr/3) * 3 + row;
                    int colV = (sqr%3) * 3 + col;
                    if(board[rowV][colV]== '.')continue;
                    if(need.contains(board[rowV][colV])){
                        return false;
                    }
                    need.add(board[rowV][colV]);

                }
            }
        }

        return true;
    }
}
