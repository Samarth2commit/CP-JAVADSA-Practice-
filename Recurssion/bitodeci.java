class Demo {
    static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        return binaryHelper(n);
    }

    static String binaryHelper(int n) {
        if (n == 0) {
            return "";
        }
        return binaryHelper(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10));
    }
}