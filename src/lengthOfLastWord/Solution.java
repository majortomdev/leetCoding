package lengthOfLastWord;

import java.util.StringTokenizer;

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && count < 1) continue;
            else if (s.charAt(i) == ' ' && count >= 1) {
                return count;
            }
            count++;
        }
        return count;
    }

    public int lengthOfLastWordOld(String s) {
        String[] inWords = s.split(" ");
        int len = inWords[inWords.length - 1].length();
        return len;
    }
}