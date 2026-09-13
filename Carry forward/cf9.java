class Demo {
    public static void main(String[] args) {
        
        String S = "baca";
        int countConsonent = 0;
        int ans = 0;

        for(int i=0;i<S.length();i++){
            if(S.charAt(i) == 'b' ||
    S.charAt(i) == 'c' ||
    S.charAt(i) == 'd' ||
    S.charAt(i) == 'f' ||
    S.charAt(i) == 'g' ||
    S.charAt(i) == 'h' ||
    S.charAt(i) == 'j' ||
    S.charAt(i) == 'k' ||
    S.charAt(i) == 'l' ||
    S.charAt(i) == 'm' ||
    S.charAt(i) == 'n' ||
    S.charAt(i) == 'p' ||
    S.charAt(i) == 'q' ||
    S.charAt(i) == 'r' ||
    S.charAt(i) == 's' ||
    S.charAt(i) == 't' ||
    S.charAt(i) == 'v' ||
    S.charAt(i) == 'w' ||
    S.charAt(i) == 'x' ||
    S.charAt(i) == 'y' ||
    S.charAt(i) == 'z') {
 countConsonent++;
        }
        if(S.charAt(i) == 'a' ||
   S.charAt(i) == 'e' ||
   S.charAt(i) == 'i' ||
   S.charAt(i) == 'o' ||
   S.charAt(i) == 'u'){
    ans = ans + countConsonent;
   }

   
    }
    System.out.println(ans);
}
}