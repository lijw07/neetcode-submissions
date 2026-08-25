class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> cache = new HashMap<>();

        for (String word : strs) {
            int[] alpha = new int[26];
            for (char letter : word.toCharArray()) {
                alpha[letter - 'a']++;
            }
            String key = Arrays.toString(alpha);

            if (!cache.containsKey(key))
                cache.put(key, new ArrayList<>());

            cache.get(key).add(word);
        }

        return new ArrayList<>(cache.values());
    }
}
