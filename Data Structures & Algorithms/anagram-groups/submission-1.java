class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] sort = strs[i].toCharArray();
            Arrays.sort(sort);
            String key = Arrays.toString(sort);

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
