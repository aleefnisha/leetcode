class Solution{
    public int strStr(String haystack, String needle) {
    if (needle == null || haystack == null) return -1; 
    if (needle.isEmpty()) return 0;                   

    int hLen = haystack.length();
    int nLen = needle.length();
    for (int i = 0; i <= hLen - nLen; i++) {
        if (haystack.substring(i, i + nLen).equals(needle)) {
            return i; 
        }
    }

    return -1; 
}
}
