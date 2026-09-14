class Demo {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, 5, -1, 2};

        int sum=0;
       
        int end=0;

        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
                
            }
            if(sum>maxsum){
                maxsum=sum;
                end=i;
                
            }
        }
        System.out.println(maxsum);
        
        System.out.println("It ended at:"+end);
    }
}
