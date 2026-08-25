class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int j = 0; j < strs.length; j++) {
            char[] compare = strs[j].toCharArray();
            Arrays.sort(compare);
            String key = Arrays.toString(compare);

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());
            map.get(key).add(strs[j]);
        }

        return new ArrayList<>(map.values());
    }
}
