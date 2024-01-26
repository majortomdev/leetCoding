package reverseVowelsOfAString;

import java.util.*;

class Solution {

    public static void main(String[]args){
        Solution s = new Solution();
        String reversed = s.reverseVowels("Voicemail");
        System.out.println(reversed);
    }
    public  String reverseVowels(String s) {
        Map<Integer,Character> locations = new HashMap<>();
        List<Integer> locs = new ArrayList<>();
        char[] stringInChars= new char[s.length()];
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            stringInChars[i]=x;
            if(x=='a' ||x=='e'||x=='i'||x=='o'||x=='u'){
                locs.add(i);
                locations.put(i,x);
            }
        }
        int size = locs.size()-1;
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            if(x=='a' ||x=='e'||x=='i'||x=='o'||x=='u'){
                int vowel = locs.get(size);
               stringInChars[i]=locations.get(vowel);
               size--;
            }
            }
        return String.valueOf(stringInChars);
        }
    }