import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr = new int[spells.length];
        Arrays.sort(potions); // Sort the potions array
        
        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int left = 0, right = potions.length - 1;
            
            // Binary search for the first potion that makes spell * potion >= success
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spell * potions[mid] >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            arr[i] = potions.length - left; // Count of successful pairs for this spell
        }
        
        return arr;
    }
}
