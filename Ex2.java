package ExArray;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        int a[];
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Input n:");
        n = in.nextInt();
        a = new int[n];
        System.out.println("Input index of array:");
        intArray(n,a);
        System.out.println("Average is:" + getAverage(a));
    }
    public static void intArray(int size,int a[]){
        Scanner in = new Scanner(System.in);
        for(int i =0 ; i <size;i++){
            a[i] = in.nextInt();
        }
    }
    public static double getAverage(int[]array){
        int sum =0;
        double avg;
        for (int i= 0; i<array.length; i++){
            sum += array[i];
        }
        return avg = (double) sum/array.length;
    }
}
