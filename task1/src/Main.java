import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scan.nextInt();
        System.out.print("Введите шаг: ");
        int m = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = i+1;
        }

        String res = Integer.toString(arr[0]);
        int pos = (m-1) % n;

        while(pos != 0){
            res += arr[pos];
            pos = (pos + (m-1)) % n;
        }

        System.out.println(res);
    }
}