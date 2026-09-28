class Demo {
    static boolean checkPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return checkPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(checkPalindrome(s, 0, s.length() - 1));
    }
}