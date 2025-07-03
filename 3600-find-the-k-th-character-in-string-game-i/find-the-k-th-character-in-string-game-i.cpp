class Solution {
public:
    char kthCharacter(int k) {
        int bit = __builtin_popcount(k-1);
        return 'a'+ bit;   
    }
};