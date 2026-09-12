class Demo{
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int prefarr[] = new int[arr.length];
        int L=1;
        int R=3;
        prefarr[0]=arr[0];
        for(int i=1;i<prefarr.length;i++){
            prefarr[i]=prefarr[i-1]+arr[i];
        }
        if(L>0 && R<prefarr.length){
            System.out.println(prefarr[R]-prefarr[L-1]);
        }else if(L==0 && R<prefarr.length){
            System.out.println(prefarr[R]);
        }else if(L<0 || R>arr.length){
            System.out.println("Enter proper limits");
        }
    }
}