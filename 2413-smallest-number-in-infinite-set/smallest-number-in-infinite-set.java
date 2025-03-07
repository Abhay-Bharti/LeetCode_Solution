
class SmallestInfiniteSet {
    private TreeSet<Integer> set;
    private int current = 1;

    public SmallestInfiniteSet() {
        set = new TreeSet<>();
    }

    public int popSmallest() {
        if (!set.isEmpty()) {
            int n = set.first();
            set.remove(n);
            return n;
        }
        return current++;
    }

    public void addBack(int num) {
        if(num < current){
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */