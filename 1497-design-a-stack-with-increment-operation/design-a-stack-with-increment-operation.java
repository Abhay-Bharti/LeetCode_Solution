class CustomStack {
    int[] stack;
    int size;
    int top;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        Arrays.fill(stack, -1);
        size = maxSize;
        top = -1;
    }

    public void push(int x) {
        if (top == size - 1) {
            return;
        }
        top++;
        stack[top] = x;
    }

    public int pop() {
        if (top == -1) {
            return -1;
        }
        int val = stack[top];
        stack[top] = -1;
        top--;
        return val;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < size && i < k; i++) {
            if (stack[i] != -1) {
                stack[i] += val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */