class Solution {
    public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
        if(tomatoSlices == 0 && cheeseSlices == 0){
            return new ArrayList<Integer>(Arrays.asList(0,0));
        }
        if (tomatoSlices == 0 || cheeseSlices == 0 || tomatoSlices % 2 != 0 || tomatoSlices <= cheeseSlices || (tomatoSlices / 4) > cheeseSlices || (tomatoSlices/2) < cheeseSlices) {
            return new ArrayList<Integer>();
        }

        int x = (tomatoSlices - 2*cheeseSlices) / 2;
        int y = cheeseSlices - x;

        return new ArrayList<Integer>(Arrays.asList(x, y));

    }
}