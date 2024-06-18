package happyNumber;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isHappy(19));
        //System.out.println(s.changeItToDigitsSquared(98256));
    }

    public boolean isHappy(int n) {
        int iter = 15;
        int total=n;
        while(total>0) {
                List<Integer> squares = changeItToDigitsSquared(total);
                total = 0;
                for (int j = 0; j < squares.size(); j++) {
                    total += squares.get(j);
                }
                if (total == 1) return true;
                if(--iter<1) return false;
        }
        return false;
    }

    public ArrayList<Integer> changeItToDigitsSquared(int num){
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(num>=1){
            int st = num%10;
            list.add(st*st);
            num = num/10;
        }
        return list;
    }
}
