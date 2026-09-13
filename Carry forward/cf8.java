class Demo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 2, 2};
        int count1 = 0;
        int ans = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count1++;

            }else if(arr[i] == 2){
                ans = ans + count1;
            }
        }
        System.out.println(ans);
    }
}
