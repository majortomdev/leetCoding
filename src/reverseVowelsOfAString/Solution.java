package reverseVowelsOfAString;

import java.util.*;

class Solution {

    public static void main(String[]args){
        Solution s = new Solution();
        String reversed = s.reverseVowels("aejhiolpwqu");
        System.out.println(reversed);
    }
    public  String reverseVowels(String s) {
        List<Integer> Indices = new ArrayList<>();
        List<Character> vowels = new ArrayList<>();
        char[] stringInChars= new char[s.length()];
        for(int i=0; i<s.length(); i++){
            char x = s.charAt(i);
            stringInChars[i]=x;
            if(x=='a' ||x=='e'||x=='i'||x=='o'||x=='u'||x=='A' ||x=='E'||x=='I'||x=='O'||x=='U'){
                Indices.add(i);
                vowels.add(x);
            }
        }
        int vow = vowels.size()-1;
        for (int j=0; j<Indices.size();j++){
            int index1 = Indices.get(j);
            stringInChars[index1] = vowels.get(vow);
            vow--;
        }

        return String.valueOf(stringInChars);
        }
    }