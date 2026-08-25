class MinStack {
    List<Integer> stack;
    int size;
    public MinStack() {
        stack = new ArrayList<>();
        size = 0;
    }
    
    public void push(int val) {
        stack.add(val);
        size++;
    }
    
    public void pop() {
        stack.remove(size - 1);
        size = size - 1;
    }
    
    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.get(size - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;

        for (int val : stack)
            min = Math.min(min, val);

        return min;
    }
}
