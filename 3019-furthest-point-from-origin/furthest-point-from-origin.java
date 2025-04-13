class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int[] arr = {0, 0, 0};

        for(int i = 0; i<moves.length(); i++){
            char ch = moves.charAt(i);

            switch(ch){
                case 'L':
                    arr[0]++;
                    break;
                case 'R':
                    arr[1]++;
                    break;
                case '_':
                    arr[2]++;
                    break;
            }
        }

        return Math.abs(arr[0] - arr[1]) + arr[2];
    }
}