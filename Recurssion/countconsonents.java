class Demo {
    static int countConsonants(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        char ch = str.charAt(index);
        int count = 0;
        if (isLetter(ch) && !isVowel(ch)) {
            count = 1;
        }
        return count + countConsonants(str, index + 1);
    }

    static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        System.out.println(countConsonants("hello", 0));
    }
}