class Demo {
    static int countCharacter(String str, int index, char target) {
        if (index == str.length()) {
            return 0;
        }
        int count = 0;
        if (str.charAt(index) == target) {
            count = 1;
        }
        return count + countCharacter(str, index + 1, target);
    }

    public static void main(String[] args) {
        System.out.println(countCharacter("hello world", 0, 'o'));
    }
}