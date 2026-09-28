class Demo {
    static boolean isPalindrome(String str) {
        return palindromeHelper(str, 0, str.length() - 1);
    }

    static boolean palindromeHelper(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        return palindromeHelper(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }
}