class Demo {
    public static void main(String[] args) {
        String S = "AABC";
        int countA = 0;
        int countAB = 0;
        int ans = 0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'A'){
                countA++;
            }else if(countA>0 && S.charAt(i) == 'B' ){
                countAB = countAB + countA;
            }else if(countAB>0 && S.charAt(i) == 'C'){
                ans = ans + countAB;
            }
        }
        System.out.println(ans);
    }
}
