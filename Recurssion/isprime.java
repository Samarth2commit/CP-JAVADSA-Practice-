class Demo {
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        return primeHelper(n, 2);
    }

    static boolean primeHelper(int n, int divisor) {
        if (divisor * divisor > n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return primeHelper(n, divisor + 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(17));
    }
}