class Demo {
    public static void main(String[] args) {
        String S = "XXAYY";

        int sum = 0;
        int countX = 0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='X'){
                countX++;
            }
            if(S.charAt(i)=='Y'){
                sum = sum + countX;
            }

        }
        System.out.println("The total possible pair of XY are: "+ sum);
}    
}
