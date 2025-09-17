class Node {
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value){
        this.prev = null;
        this.next = null;
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer, Node> cache;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new Node(-1, -1);
        this.tail = new Node(-1, -1);
        this.cache = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }

    public void add(Node node) {
        Node nextNode = head.next;
        node.next = nextNode;
        nextNode.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if(!cache.containsKey(key)){
            return -1;
        }

        Node node = cache.get(key);
        remove(node);
        add(node);
        return node.value;
        
    }

    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node oldNode = cache.get(key);
            remove(oldNode);
        }

        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        add(newNode);
        
        if(cache.size() > capacity){
            Node prevNode = tail.prev;
            cache.remove(prevNode.key);
            remove(prevNode);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */