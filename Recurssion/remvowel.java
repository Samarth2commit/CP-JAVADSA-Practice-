class Demo {
    static String removeVowels(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        char ch = str.charAt(index);
        if (isVowel(ch)) {
            return removeVowels(str, index + 1);
        }
        return ch + removeVowels(str, index + 1);
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("recursion", 0));
    }
}