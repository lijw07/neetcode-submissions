class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> anagram = new HashMap<Character, Integer>();

        // first populate all values into map
        for (int i = 0; i < s.length(); i++) {
            if (anagram.containsKey(s.charAt(i)))
                anagram.put(s.charAt(i), (anagram.get(s.charAt(i)) + 1));
            else
                anagram.put(s.charAt(i), 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (anagram.containsKey(t.charAt(i)) && anagram.get(t.charAt(i)) > 0)
                anagram.put(t.charAt(i), (anagram.get(t.charAt(i)) - 1));
            else
                return false;
        }

        for (Map.Entry<Character, Integer> entry : anagram.entrySet()) {
            if (entry.getValue() != 0)
                return false;
        }

        return true;
    }
}
