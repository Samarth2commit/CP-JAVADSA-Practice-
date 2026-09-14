class Demo {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int sum=0;
        int start=0;
        int end=0;

        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
                start=i+1;
            }
            if(sum>maxsum){
                maxsum=sum;
                end=i;
                
            }
        }
        System.out.println(maxsum);
        System.out.println("It started at:"+start);
        System.out.println("It ended at:"+end);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
