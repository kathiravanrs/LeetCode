class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] row = new HashSet[9];
        Set<Character>[] col = new HashSet[9];
        Set<Character>[] box = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                Character a = board[i][j];
                if(a.equals('.')) continue;
                if(Character.isDigit(a)){
                    if(row[i].contains(a)||col[j].contains(a)||box[(i/3)*3+(j/3)].contains(a)) return false;
                    else{
                        row[i].add(a);
                        col[j].add(a);
                        box[(i/3)*3+(j/3)].add(a);
                    }
                }
                else return false;
            }
        }
        return true;
    }
}