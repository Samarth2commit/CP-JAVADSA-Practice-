class Demo{
    public static void main(String[] args) {

        String S = "ABCGAG";
        int countA = 0;
        int ans = 0;
        //forward
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='A'){
                countA++;
            }
            if(S.charAt(i)=='G'){
                ans = ans + countA;
            }
        }
        System.out.println("answer is: "+ans);

        int countG=0;
        int backSum=0;
        //backwards
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)=='G'){
                countG++;
            }if(S.charAt(i)=='A'){
                backSum = backSum + countG;
            }
        }
        System.out.println("Backward appproach: " +backSum);
    }
}