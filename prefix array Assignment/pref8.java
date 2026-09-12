import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int arr[]={10, 20, 30, 40, 50};
        int prefarr[] = new int[arr.length];
        int L=sc.nextInt();
        int R=sc.nextInt();
        prefarr[0]=arr[0];
        for(int i=1;i<prefarr.length;i++){
            prefarr[i]=prefarr[i-1]+arr[i];
        }
        if(L>0 && R<prefarr.length){
            System.out.println((prefarr[R]-prefarr[L-1])/(R-L+1));
        }else if(L==0 && R<prefarr.length){
            System.out.println((prefarr[R])/(R-L+1));
        }else if(L<0 || R>arr.length){
            System.out.println("Enter proper limits");
        }
    }
}
