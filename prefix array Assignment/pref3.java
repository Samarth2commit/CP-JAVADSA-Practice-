import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={7, 3, 2, 6, 4};
        int prefarr[] = new int[arr.length];
        int K=sc.nextInt();
        
        prefarr[0]=arr[0];
        for(int i=1;i<prefarr.length;i++){
            prefarr[i]=prefarr[i-1]+arr[i];
        }
        if(K>0){
            System.out.println(prefarr[K-1]);
        }else if(K==0){
            System.out.println(0);
        }else if(K<0 || K>arr.length){
            System.out.println("Enter proper limits");
        }
    }
}