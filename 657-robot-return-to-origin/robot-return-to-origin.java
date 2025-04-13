class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for(int i = 0; i<moves.length(); i++){
            char ch = moves.charAt(i);

            switch( ch ){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x++;
                    break;
                case 'R':
                    x--;
                    break;
            }
        }
        if( x == 0 && y == 0)
            return true;
        return false;
    }
}