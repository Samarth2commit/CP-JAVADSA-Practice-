class Demo {
    static String removeCharacter(String str, int index, char target) {
        if (index == str.length()) {
            return "";
        }
        char ch = str.charAt(index);
        if (ch == target) {
            return removeCharacter(str, index + 1, target);
        }
        return ch + removeCharacter(str, index + 1, target);
    }

    public static void main(String[] args) {
        System.out.println(removeCharacter("programming", 0, 'm'));
    }
}