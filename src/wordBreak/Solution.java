package wordBreak;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<String> wList = new ArrayList<>(Arrays.asList("aaaa","aaa"));
        String stringy = "aaaaaaa";
        System.out.println(sol.wordBreak(stringy,wList));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        wordDict.sort(Comparator.comparingInt(String::length));

        int indexCheck = 0;
        while(indexCheck<s.length()){
            int tracker = indexCheck;
            for (String str : wordDict) {
                if (s.indexOf(str) == indexCheck) {
                    int len = str.length();

                    s = coverWordAlreadyFound(s,indexCheck,indexCheck+len);
                    indexCheck += len;

                    break;
                }

            }
            if(tracker==indexCheck)return false;

        }
    return true;
    }

    public String coverWordAlreadyFound(String str, int start, int end){
        String early = str.substring(0,start);
        String middle = "";
        for (int i=0; i<end-start; i++){
            middle+="*";
        }
        String last = str.substring(end);
        return early+middle+last;
    }

}
