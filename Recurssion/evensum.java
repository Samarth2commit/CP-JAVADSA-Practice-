class Demo {
    static int sumEven(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        if (arr[index] % 2 == 0) {
            return arr[index] + sumEven(arr, index + 1);
        }
        return sumEven(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(sumEven(arr, 0));
    }
}