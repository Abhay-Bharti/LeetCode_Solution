class Info implements Comparable<Info>{
    int i;
    int j;
    double fraction;

    public Info(int i, int j, double fraction){
        this.i = i;
        this.j = j;
        this.fraction = fraction;
    }

    @Override
    public int compareTo(Info obj){
        return Double.compare(this.fraction, obj.fraction);
    }
}

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Info> heap = new PriorityQueue<>();

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                double frac = (double)arr[i]/arr[j];
                heap.add(new Info(i, j, frac));
            }
        }

        for(int i = 1; i<k; i++){
            heap.remove();

        }

        return new int[]{arr[heap.peek().i], arr[heap.peek().j]};
    }
}