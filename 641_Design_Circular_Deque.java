class MyCircularDeque {
    int[] arr;
    int front, rear, size;

    public MyCircularDeque(int k) {
        arr = new int[k];
        front = -1;
        rear = 0;
        size = k;

    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = size - 1;
        } else {
            front--;
        }
        arr[front] = value;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        if (front == -1) {
            front = rear = 0;
        } else if (rear == size - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = value;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }

        if (front == rear) {
            front = rear = -1;
        } else if (front == size - 1) {
            front = 0;
        } else {
            front++;
        }
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (rear == front) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = size - 1;
        } else {
            rear--;
        }
        return true;
    }

    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return ((front == 0 && rear == size-1) || (front == rear + 1));
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */