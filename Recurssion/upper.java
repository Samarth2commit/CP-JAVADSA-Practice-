class Demo {
    static String toUppercase(String str, int index) {
        if (index == str.length()) {
            return "";
        }
        char ch = str.charAt(index);
        if (ch >= 'a' && ch <= 'z') {
            ch = (char) (ch - 32);
        }
        return ch + toUppercase(str, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(toUppercase("panda", 0));
    }
}