class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s = 0, e = people.length - 1;
        int count = 0;
        while (s <= e) {
            if (people[e] + people[s] <= limit) {
                count++;
                s++;
                e--;
            } else {
                count++;
                e--;
            }
        }
        return count;
    }
}