class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();
        Arrays.sort(sortS);
        Arrays.sort(sortT);

        return Arrays.equals(sortS, sortT);
    }
}
