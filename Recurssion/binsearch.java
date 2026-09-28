class Demo {
    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(arr, 5, 0, arr.length - 1));
    }
}