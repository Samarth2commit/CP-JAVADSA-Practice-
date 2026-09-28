class Demo {
    static int gcdArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int gcdOfRest = gcdArray(arr, index + 1);
        return gcd(arr[index], gcdOfRest);
    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int[] arr = {12, 24, 36};
        System.out.println(gcdArray(arr, 0));
    }
}