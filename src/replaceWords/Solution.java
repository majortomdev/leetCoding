package replaceWords;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        List<String> list = new ArrayList<>();
        list.add("cat");
        list.add("bat");
        list.add("rat");
        String sent = "the cattle was rattled by the battery";
        String ans = sol.replaceWords(list,sent);
        System.out.println(ans);
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> set = new HashSet<String>(dictionary);
        String[] singleWords = sentence.split(" ");
        for(int i=0; i<singleWords.length; i++){
            singleWords[i] = leastRoot(singleWords[i],set);
        }
        return Arrays.toString(singleWords).replace(",","")
                .replace("[","").replace("]","");
    }

    public String leastRoot(String word, Set set){
        int i=0;
        while (i < word.length()){
            String root = word.substring(0,++i);
            if(set.contains(root)){
                return root;
            }
        }
        return word;
    }

    public String replaceWordsSlowVersion(List<String> dictionary, String sentence) {
        String[] singleWords = sentence.split(" ");
        Collections.sort(dictionary, Comparator.comparing(String::length));
        for(int i=0; i<singleWords.length; i++){
            for(int j=0; j<dictionary.size(); j++){
                if(singleWords[i].indexOf(dictionary.get(j)) == 0){
                    singleWords[i] = dictionary.get(j);
                    break;
                }
            }
        }
        return Arrays.toString(singleWords).replace(",","")
                .replace("[","").replace("]","");
    }

//    public static List SortList(List list){
//        Collections.sort(list, Comparator.comparing(String::length));
//        return list;
//    }
}






/*    In English, we have a concept called root, which can be followed by some other word to
form another longer word - let's call this word derivative. For example, when the root "help" is
followed by the word "ful", we can form a derivative "helpful".


Given a dictionary consisting of many roots and a sentence consisting of words separated
by spaces, replace all the derivatives in the sentence with the root forming it. If a derivative
can be replaced by more than one root, replace it with the root that has the shortest length.

Return the sentence after the replacement.


Example 1:

Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"


 */