class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> seq = new HashMap<Character, Character>(3);
        seq.put('}', '{');
        seq.put(')', '(');
        seq.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (seq.containsKey(val))
                if (!stack.isEmpty() && seq.get(val).equals(stack.peek()))
                    stack.pop();
                else
                    return false;
            else
                stack.push(val);
        }

        return stack.isEmpty();
    }
}
