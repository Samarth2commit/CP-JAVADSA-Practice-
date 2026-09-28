class Demo {
    static int countOccurrences(int[] arr, int index, int target) {
        if (index == arr.length) {
            return 0;
        }
        int count = 0;
        if (arr[index] == target) {
            count = 1;
        }
        return count + countOccurrences(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2};
        System.out.println(countOccurrences(arr, 0, 2));
    }
}