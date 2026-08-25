class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] initial = str.toCharArray();
            Arrays.sort(initial);
            String sortedIntitial = Arrays.toString(initial);
            if (!map.containsKey(sortedIntitial))
                map.put(sortedIntitial, new ArrayList<>());
            map.get(sortedIntitial).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
