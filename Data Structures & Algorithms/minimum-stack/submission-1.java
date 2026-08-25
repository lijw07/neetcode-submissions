class MinStack {
    List<Integer> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        if (stack.isEmpty())
            return;
        
        stack.remove(stack.size() - 1);
    }
    
    public int top() {
        if (stack.isEmpty()) return -1;

        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int num : stack) {
            min = Math.min(min, num);
        }

        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */