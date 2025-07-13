class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0, count = 0;
        while (i < players.length && j < trainers.length) {
            // System.out.println(players[i] + " "+ i + "  " + trainers[j] +  " " + j);
            if (players[i] <= trainers[j]) {
                count++;
                i++;
                j++;
            }else{
                j++;
            }
        }

        return count;
    }
}