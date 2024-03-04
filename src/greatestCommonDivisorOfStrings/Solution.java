package greatestCommonDivisorOfStrings;

class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.gcdInt(4,4));
    }

    public static int gcdInt(int a, int b){
//just keep subtracting the lesser of the two until theyre equal giving the gcd
        while (a !=b) //a=36    28.... 20      12     4      b= 8
        if (a > b) {  //true    true   true    true   false
            a= a - b;   //a=28  =20     12     4        #
        }else { //                                      #
            b= b -a;//                                  b=4
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {

        String res="";
        int max = Math.min(str2.length(),str1.length());
        int gcd = gcdInt(str1.length(),str2.length());

        for (int i =0; i<str1.length(); i++){

        }


        return res;
    }
}