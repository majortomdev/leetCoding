class ZigZagConversion {

    static String str = "PAYPALISHIRING";
    public String convert(String s, int numRows) {
        String result = "";

        int he = numRows;
        int le = s.length()/2;
        int tick =0;
        int [][] myArr= new int[le][he];

        for(int i =0; i<le; i++){
            for(int j =he-1; j>=0; j--){
                myArr[i][j]=s.charAt(tick);
                tick++;
            }
        }

        for(int x=0; x<le; x++){
            System.out.println(myArr[x][2]);
        }

        return result;
    }


    public static void main(String[] args) {
//        ZigZagConversion zag = new ZigZagConversion();
//        zag.convert(str,3);
        int s = -345;
        String as = String.valueOf(s);

        System.out.println(as);
    }
}