import java.util.*;

public class cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of players scored: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter scores :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min =arr[0];
        int sum =0;


        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];

        }

        int avg = sum/n;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);

    }
}
