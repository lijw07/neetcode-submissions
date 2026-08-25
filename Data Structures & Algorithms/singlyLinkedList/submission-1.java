class ListNode {
    int val;
    ListNode next;
    
    protected ListNode(int val) {
        this(val, null);
    }
    
    protected ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    ListNode head;
    ListNode tail;
    public LinkedList() {
        head = new ListNode(-1);
        tail = head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int count = 0;

        while (curr != null) {
            if (count == index) {
                return curr.val;
            }
            count++;
            curr = curr.next;
        }
        
        return -1;
    }

    public void insertHead(int val) {
        ListNode curr = new ListNode(val);
        curr.next = head.next;
        head.next = curr;
        if (curr.next == null) {
            tail = curr;
        }
    }

    public void insertTail(int val) {
        tail.next = new ListNode(val);
        tail = tail.next;
    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        // Remove the node ahead of curr
        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode curr = head.next;
        while(curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }

        return result;
    }
}
