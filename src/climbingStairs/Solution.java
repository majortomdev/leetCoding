package climbingStairs;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.mySqrt(2147395600));
        System.out.println(s.mySqrt(2601));
    }
    public int climbStairs(int n) {
        return 0;
    }

    public int mySqrtXX(int x) {
        if(x==0)return 0;
        if(x<4)return 1;
        if(x<9)return 2;

        for (int i=3; i<x; i++){
            if(i*i<=x &&(i+1)*(i+1)>x){
                return i;
            }
        }
        return 0;
    }



    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x<4)return 1;
        if(x<9)return 2;

        for (int i=3; i<=x/2; i++){
            int ns = i+1;
            if(ns*ns>x){
                return i;
            }
        }
        return 0;
    }
}