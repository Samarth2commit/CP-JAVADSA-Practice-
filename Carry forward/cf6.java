class Demo{
    public static void main(String[] args) {
        String S = "AAGAG";
        int countG = 0;
       
        for(int i = S.length()-1;i>=0;i--){
           if(S.charAt(i) == 'G'){
            countG++;
           }
           else if(S.charAt(i) == 'A'){
            System.out.println(countG);
           }
        }
     
    }
}
