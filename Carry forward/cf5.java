class Demo {
    public static void main(String[] args) {
        int arr[] = {-2, 3, -1, 4};
        int negCount = 0;
        int pair = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] <0){
                negCount++;
            }
            else if(arr[i]>0){
                pair = pair + negCount;
            }
        }
        System.out.println("Total (negative,positive) pairs are :"+pair);
    }    
}
