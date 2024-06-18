package reverseInteger;

class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int test = -45134;
        System.out.println(sol.reverse(test));
        //System.out.println(sol.chopLeadingZeroes("00654"));
    }

    public int reverse(int x) {
        long reverse = 0;
        int temp;

        while (x != 0) {
            temp = x % 10;
            reverse = reverse * 10 + temp;
            x = x / 10;

            if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int)reverse;
    }

    public int reversev2(int x) {
        String intString = String.valueOf(x);
        boolean isNegative= false;
        if(intString.charAt(0)=='-'){
            isNegative=true;
            intString = intString.substring(1);
        }
        int finish=0;
        //String choppedIntString = chopLeadingZeroes(intString);
        //StringBuilder build = new StringBuilder(choppedIntString);
        StringBuilder build = new StringBuilder(intString);
        build.reverse();
        String st = build.toString();
        if (isNegative){
            st = "-"+st;
        }
        Long backToDigits = Long.parseLong(st);
        if(backToDigits>2147483647 || backToDigits<-2147483648) return 0;
        else {
            finish = Math.toIntExact(backToDigits);
        }
        return finish;
        }


    public String chopLeadingZeroes(String s){
        int i=0;

        while(s.charAt(i)=='0'){
            i++;

        }
        return s.substring(i);
    }
}