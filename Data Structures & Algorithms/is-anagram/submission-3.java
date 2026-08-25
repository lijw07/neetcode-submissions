class Solution {
    public boolean isAnagram(String s, String t) {
        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();
        Arrays.sort(strS);
        Arrays.sort(strT);
        return Arrays.equals(strS, strT);
    }
    
}
