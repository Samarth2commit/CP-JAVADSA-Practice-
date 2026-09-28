class Demo {
    static void printAllSubstrings(String str) {
        if (str.length() == 0) {
            return;
        }
        printSubstrings(str, 0, 1);
    }

    static void printSubstrings(String str, int start, int end) {
        if (start == str.length()) {
            return;
        }
        if (end > str.length()) {
            printSubstrings(str, start + 1, start + 2);
            return;
        }
        System.out.println(str.substring(start, end));
        printSubstrings(str, start, end + 1);
    }

    public static void main(String[] args) {
        printAllSubstrings("abc");
    }
}