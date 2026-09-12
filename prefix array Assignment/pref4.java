import java.util.Scanner;
class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr = {5, 1, 2, 7, 3};
        int []prearr = new int[arr.length];
        prearr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prearr[i] = prearr[i-1]+arr[i];
        }
        int L = sc.nextInt();
        if(L>0 && L<prearr.length){
            System.out.println(prearr[prearr.length-1]-prearr[L-1]);
        }else if(L==0 && L<prearr.length){
            System.out.println(prearr[prearr.length-1]);
        }else if(L<0 || L>prearr.length-1){
            System.out.println("Enter the proper limits");
        }

    }
}