class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> tValue = new ArrayList<>();

        for (Character letter : t.toCharArray()) {
            tValue.add(letter);
        }

        for (Character letter : s.toCharArray()) {
            if (tValue.contains(letter))
                tValue.remove(letter);
            else
                return false;
        }

        return tValue.isEmpty() ? true : false;
    }
}