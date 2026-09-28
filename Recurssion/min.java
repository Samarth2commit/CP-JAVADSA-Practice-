class Demo {
    static int findMin(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minOfRest = findMin(arr, index + 1);
        if (arr[index] < minOfRest) {
            return arr[index];
        }
        return minOfRest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        System.out.println(findMin(arr, 0));
    }
}