class Demo {
    static int stringLength(String str) {
        if (str.equals("")) {
            return 0;
        }
        return 1 + stringLength(str.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(stringLength("compile"));
    }
}