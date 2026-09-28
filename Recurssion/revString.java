class Demo {
    static String reverseString(String str) {
        return reverseHelper(str, str.length() - 1);
    }

    static String reverseHelper(String str, int index) {
        if (index < 0) {
            return "";
        }
        return str.charAt(index) + reverseHelper(str, index - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}