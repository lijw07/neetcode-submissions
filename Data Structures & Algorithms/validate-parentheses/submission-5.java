class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!valid.isEmpty()) {
                if (valid.peek() == '[' && s.charAt(i) == ']'
                || valid.peek() == '{' && s.charAt(i) == '}'
                || valid.peek() == '(' && s.charAt(i) == ')')
                    valid.pop();
                else 
                    valid.add(s.charAt(i));
            } else
                valid.add(s.charAt(i));
        }

        if (valid.isEmpty())
            return true;
        return false;
    }
}
