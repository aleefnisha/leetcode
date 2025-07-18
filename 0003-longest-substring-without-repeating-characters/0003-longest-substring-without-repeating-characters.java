class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128]; 
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndex[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1;
        }

        return maxLength;
    }
        
    }
