class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> row=new HashSet<>();
        HashSet<Character> col=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            row.clear();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]!='.')
                {
                    if(row.contains(board[i][j]))
                    return false;
                    row.add(board[i][j]);
                }
            }
        }
        for(int i=0;i<9;i++)
        {
            col.clear();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]!='.')
                {
                    if(col.contains(board[j][i]))
                    return false;
                    col.add(board[j][i]);
                }
            }
        }
        for(int r=0;r<9;r+=3)
        {
            for(int c=0;c<9;c+=3)
            {
                HashSet<Character> set=new HashSet<>();
                for(int i=r;i<r+3;i++)
                {
                    for(int j=c;j<c+3;j++)
                    {
                        if(board[i][j]!='.')
                        {
                            if(set.contains(board[i][j]))
                            return false;
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
