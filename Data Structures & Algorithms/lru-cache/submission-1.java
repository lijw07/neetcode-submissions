class LRUCache {
    public class ListNode {
        int key, val;
        ListNode next, prev;
        public ListNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    HashMap<Integer, ListNode> cache;
    int capacity;
    ListNode head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>();

        head = new ListNode(0, 0);
        tail = new ListNode(0, 0);

        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        ListNode node = cache.get(key);

        if (node == null) return -1;

        moveToHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        ListNode node = cache.get(key);

        if (node != null) {
            node.val = value;
            moveToHead(node);
        } else {

            if (cache.size() >= this.capacity) {
                ListNode tail = removeTail();
                cache.remove(tail.key);
            }

            ListNode newNode = new ListNode(key, value);
            addToHead(newNode);
            cache.put(key, newNode);
        }
    }

    public void moveToHead(ListNode node) {
        removeNode(node);
        addToHead(node);
    }

    public void removeNode(ListNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void addToHead(ListNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    public ListNode removeTail() {
        ListNode lastNode = tail.prev;
        removeNode(lastNode);
        return lastNode;
    }
}
