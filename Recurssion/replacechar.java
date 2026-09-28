class Demo {
    static String replaceCharacters(String str, int index, char oldChar, char newChar) {
        if (index == str.length()) {
            return "";
        }
        char current = str.charAt(index);
        if (current == oldChar) {
            current = newChar;
        }
        return current + replaceCharacters(str, index + 1, oldChar, newChar);
    }

    public static void main(String[] args) {
        System.out.println(replaceCharacters("banana", 0, 'a', 'o'));
    }
}