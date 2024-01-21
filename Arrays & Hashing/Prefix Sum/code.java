import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = input.nextInt();
        int [] arr = new int[size];
        int [] pre = new int[size+1];
        pre[0] = 0;
        for (int i = 0; i<size ; i++){
            System.out.println("enter element number " + i);
            arr[i] = input.nextInt();
            if (i!=0){
                pre[i] = arr[i-1] + pre[i-1];
            }
        }
        System.out.println("enter L");
        int l = input.nextInt();
        System.out.println("enter R");
        int R = input.nextInt();
        int sum = pre[R]-pre[l-1] ;
        System.out.println("Sum from element "+ l + " to element " + R+" = " + sum  );


    }
}
