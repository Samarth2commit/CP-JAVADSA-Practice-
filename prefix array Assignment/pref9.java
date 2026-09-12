import java.util.Scanner;
class Demo{
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 8, 6, 2, 10, 5};
        int prearr[] = new int[arr.length];


        int L =sc.nextInt();
        int R = sc.nextInt();


        int count = 0;
        for(int i = 0; i<arr.length ;i++){
            if(arr[i]>5){
                count ++;
            }
            prearr[i] = count;
        }
        if(L>0 && R<prearr.length){
            System.out.println(prearr[R]-prearr[L-1]);
        }else if(L==0  && R<prearr.length){
            System.out.println(prearr[R]);
        }else if(L<0 || R>prearr.length){
            System.out.println("Enter proper Range");
        }

    }
}

